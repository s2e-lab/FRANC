def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	
	# The sender is just the email address they used in the message payload.
	if snd == sender:
		return True

	# The sender is the object being published! We can compare directly
	elif snd == rcv:
		return True

	# There's no entity handle given, they're trying to publish with the object's handle.
	else:
		return sender_handle == entity_handle


