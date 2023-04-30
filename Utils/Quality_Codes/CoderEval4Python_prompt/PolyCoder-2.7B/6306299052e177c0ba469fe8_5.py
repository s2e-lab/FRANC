def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if not sender_handle and not entity_handle:
		raise ValueError("Sender and entity can't be both None.")
	if not sender_handle and not entity_handle:
		raise ValueError("Sender can't be both None.")
	if not sender_handle and entity_handle:
		raise ValueError("Entity can't be both None.")
	if sender_handle and entity_handle:
		if sender_handle!= entity_handle:
			raise ValueError("Sender and entity can't be both None.")

