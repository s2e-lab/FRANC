def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if sender_handle not in self._receiver_handles["users"]:
		log.error('check_sender_and_entity_handle_match: not found the sender and entity handles (%s in %s)', sender_handle, entity_handle)
		message = Message.Get(sender_handle, "user.handle.is_null")
		log.error('check_sender_and_entity_handle_match: unable to get the sender handle (%s in %s)', sender_handle, entity_handle)
		return False
		
	for entity_handle in