def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	
	if sender_handle == entity_handle:
		return True
	"""	
		There are two possibilities:

		1. sender and sender has the same author handle; we're ok
		2. sender can't find the entity, entity is responsible for sender. We ignore entity.
		3. sender is responsible for other handle (the sender has a private group
		4. sender is responsible for the entity's entity handle (the entity is responsible for sender
		5. entity handle is a private group (sender is a private group)
	"""

	# case 1
	