def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		import xml.etree.ElementTree as ET
	import base64
	from Crypto.PublicKey import RSA
	from Crypto.Signature import PKCS1_v1_5
	from Crypto.Hash import SHA256
	
	# Parse the XML document
	root = ET.fromstring(doc)
	
	# Get the signature and encoded message
	sig = base64.b64decode(signature)
	message = ET.tostring(root, encoding='UTF-8', method='xml')
	
	# Verify the signature using the public key
	rsa_key = RSA.importKey(public_key)
	h = SHA256.new(message)
	verifier = PKCS1_v1_5.new(rsa_key)
	
	if verifier.verify(h, sig):
		return True
	else:
		return False