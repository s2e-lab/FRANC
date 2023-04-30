def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	
	# The sender header should never be None.
	assert sender_handle is not None, "sender handle was None"
	
	# The sender handle should never be None.
	assert sender_handle is not None, "sender handle was None"
	
	
	# The sender header could not be None, thus the sender could not be null.
	assert sender_handle is not None, "sender handle was None"
	
	msg_body = ""
	
	# Ensure that the sender is the same as the sender who sent us the payload.