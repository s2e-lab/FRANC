def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
	author did actually generate this message.
	"""
		# Importing required modules