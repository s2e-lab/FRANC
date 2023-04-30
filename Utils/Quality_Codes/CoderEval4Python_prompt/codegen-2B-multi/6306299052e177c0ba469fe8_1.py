def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	
	entity_received_handle = None
	# If this is not an update, the entity handle should stay the same. But, if it is an update, we can pick it
	# off the payload header if it has one (which we check at the beginning, above)
	if not sender_handle is None:
		entity_received_handle = Payload.get_header_sender_handle(payload)
	if sender_handle!= entity_received_handle:
		return False
	return True