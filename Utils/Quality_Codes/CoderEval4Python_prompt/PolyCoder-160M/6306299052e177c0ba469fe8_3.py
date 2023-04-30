def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	assert_dict_equal(sender_handle, sender_handle)
	entity_handle_same_handle = handle_with_new_sender_handle("sender_handle2", sender_handle)
	assert_dict_equal(entity_handle_same_handle, entity_handle2)
	
	
	sender_handle_same_handle_with_new_object = handle_with_new_originator_object_handle_as_originator("sender_handle2", sender=sender_handle)
	assert_dict_equal(sender_handle_same_handle_with