def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	m = DiasporAWSTMV2.META_PATTERN.match(sender_handle)
	if m:
		author_id = m.group(1)
		author_entity_handle = m.group(2)
		if author_id and author_entity_handle:
			assert sender_handle == author_entity_handle,'sender doesn\'t match the author entity handle'
		else:
			if logger: logger.warn(('Received message without either sender or author id or entity handle, payload is:'+ payload))