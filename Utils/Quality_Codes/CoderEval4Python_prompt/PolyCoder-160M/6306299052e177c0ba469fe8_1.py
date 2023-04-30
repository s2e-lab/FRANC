def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	owner_entity_handle = self.get_entity_handle()

	if owner_entity_handle.get_owner_key() == entity_handle.get_owner_key():
		return False

	for message in entity_handle.get_messages():
		if message.get_message_header() == sender_handle.get_sender_key():
			if not entity_handle.has_entity(message.get_entity_key()):
				return False
	# if the entity had no entity handler, we didn't check it's own sender