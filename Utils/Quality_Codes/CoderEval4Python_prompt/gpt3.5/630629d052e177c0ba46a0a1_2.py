def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		import xml.etree.ElementTree as ET
	import base64
	from Crypto.Signature import PKCS1_v1_5
	from Crypto.PublicKey import RSA
	from Crypto.Hash import SHA256
	
	# Parse the document and get the signed element
	root = ET.fromstring(doc)
	signed_element = root.find('.//{http://www.w3.org/2000/09/xmldsig#}SignedInfo')
	
	# Get the public key and decrypt the signature
	public_key = RSA.importKey(public_key)
	signature = base64.b64decode(signature)
	
	# Calculate the hash of the signed element
	hashed_element = SHA256.new(ET.tostring(signed_element))
	
	# Verify the signature
	verifier = PKCS1_v1_5.new(public_key)
	if verifier.verify(hashed_element, signature):
	    return True
	else:
	    return False