def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		import xml.etree.ElementTree as ET
	import base64
	from Crypto.PublicKey import RSA
	from Crypto.Signature import pkcs1_15
	from Crypto.Hash import SHA256
	
	# Parse the XML document
	doc_root = ET.fromstring(doc)
	
	# Get the signed elements
	signed_elements = doc_root.findall(".//*")
	
	# Reconstruct the message to verify
	message = ""
	for elem in signed_elements:
		message += ET.tostring(elem, method="c14n").decode()
	
	# Decode the signature
	signature = base64.b64decode(signature)
	
	# Verify the signature using the public key
	key = RSA.import_key(public_key)
	h = SHA256.new(message.encode())
	try:
		pkcs1_15.new(key).verify(h, signature)
		return True
	except Exception as e:
		print(e)
		return False