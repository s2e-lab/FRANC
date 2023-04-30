def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	return sender_handle == entity_handle
	
	#
	# A common case of where sender and entity handle match
	#
	# Since sender and entity handles don't match in the same way, they should always match the payload
	# if they look good.
	#
	# There are three cases:
	#
	# 1. sender handle is the Diaspora who called us, and entity handle is an object. As such, sender will match.
	# 2. sender handle is not a valid handle and entity handle of any type, to tell if sender or entity