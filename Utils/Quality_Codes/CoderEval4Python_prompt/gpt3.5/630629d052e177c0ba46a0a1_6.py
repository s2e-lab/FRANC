def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		import xml.etree.ElementTree as ET
	from cryptography.hazmat.primitives.asymmetric import padding, utils
	from cryptography.hazmat.primitives.serialization import load_pem_public_key

	# Load public key
	public_key = load_pem_public_key(public_key.encode())

	# Parse XML elements from document
	root = ET.fromstring(doc)

	# Extract signed elements and signature
	signed_xml_elements = root.findall(".//SignedInfo/*")
	signed_xml = ET.tostring(root.find(".//SignedInfo")).decode()
	signature_value = signature.signature_value

	# Verify signature on signed elements
	hash_alg = signature.signature_algorithm_hash_algorithm.name.replace("-", "")
	hash_func = getattr(hashlib, hash_alg)
	h = hash_func(signed_xml.encode())
	try:
		public_key.verify(
			signature_value,
			h.digest(),
			padding.PKCS1v15(),
			utils.Prehashed(hash_func),
		)
	except Exception as e:
		return False

	return True