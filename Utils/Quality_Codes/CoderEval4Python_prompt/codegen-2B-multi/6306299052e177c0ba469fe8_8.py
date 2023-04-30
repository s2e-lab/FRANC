def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if sender_handle is not None and sender_handle == entity_handle:
		return		
	else:
		raise Exception("sender_handle %s does not match entity_handle %s" % (sender_handle, entity_handle))
