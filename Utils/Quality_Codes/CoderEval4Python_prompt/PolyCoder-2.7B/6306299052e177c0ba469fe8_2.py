def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	for key, value in _parse_key_value_dict((sender_handle, entity_handle, {'allow_reputation': True})):
		raise TypeError(f"Key '{key}' found in metadata mismatch of 'allow_reputation': {value} on the message. If this value is not specified, "
					"then the caller MAY have decided not to send reputation notifications of the message, and the reputation status "
					"could not be determined")


