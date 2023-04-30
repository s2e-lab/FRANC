def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	sender_handle = normalize_entity_handle(sender_handle)
	entity_handle = normalize_entity_handle(entity_handle)
	if sender_handle == entity_handle:
		return
	if entity_handle == sender_handle:
		return
	message_header = build_message_header(sender_handle, entity_handle)
	if (not is_entity_in_valid_entity_identifier(entity_handle) and
		# If it's the same entity again, do nothing.
		 # The message handler will deal with this properly