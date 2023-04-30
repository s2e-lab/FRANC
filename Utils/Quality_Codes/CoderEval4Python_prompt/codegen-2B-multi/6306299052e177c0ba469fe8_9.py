def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	# Since the entity handle (and sender) may be different than what Diaspora provides here, we need to ensure their
	# values don't collide.
	mime_type = get_mime_type(entity_handle)

	if mime_type == 'text/plain':
		content = get_payload(entity_handle)
	elif mime_type == 'application/x-vnd.gravatar-v2+json':
		content = get_payload(entity_handle)
		if not isinstance(content, basestring