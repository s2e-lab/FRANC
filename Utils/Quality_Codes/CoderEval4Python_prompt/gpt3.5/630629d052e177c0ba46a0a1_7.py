def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		import xml.etree.ElementTree as ET
	import base64
	
	# Parse the XML document
	xml_doc = ET.fromstring(doc)
	
	# Extract the SignedInfo element
	signed_info = xml_doc.find('.//{http://www.w3.org/2000/09/xmldsig#}SignedInfo')
	
	# Serialize the SignedInfo element to canonical XML
	canonical_signed_info = ET.tostring(signed_info, method='c14n')
	
	# Decode the signature
	decoded_signature = base64.b64decode(signature)
	
	# Verify the signature using the public key
	from Crypto.Signature import PKCS1_v1_5
	from Crypto.PublicKey import RSA
	
	key = RSA.importKey(public_key)
	verifier = PKCS1_v1_5.new(key)
	
	is_verified = verifier.verify(canonical_signed_info, decoded_signature)
	
	if is_verified:
		return True
	else:
		return False