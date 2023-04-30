def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if sender_handle == entity_handle:
		raise Exception("sender and entity handle didn't match. It's {}. If you think it's "
		                "a bug, contact Diaspora at github.com/dwm3/dwm3-actor-server"
		                ).format(sender_handle)
	
	"""
		Ensure that the entity actually has a valid Diaspora author set.
	"""
	from_property