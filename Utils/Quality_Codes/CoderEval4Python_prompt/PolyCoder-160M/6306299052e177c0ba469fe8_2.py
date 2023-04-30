def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if sender in sender_handle.keys():
		log.debug("Checking sender_handle %s", sender)
		return
	if entity in entity_handle.keys():
		log.debug("Checking entity_handle %s", entity)
		return
	assert sender!= "", "sender not in sender_handle but expected sender %s" % (sender, sender)
	assert entity!= "", "entity not in entity_handle %s nor expected entity %s" % (entity, entity)

	# Check if an entity handle is passed to sender_