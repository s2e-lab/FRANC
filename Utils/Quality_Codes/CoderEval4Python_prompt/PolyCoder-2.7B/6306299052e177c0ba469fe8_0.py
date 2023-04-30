def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	assert len(sender_handle) == len(entity_handle)
	for row in sender_handle:
		assert sender_handle == row[0] 
		for col in row[1]:
			assert entity_handle == col[0], "Mismatch! %s!= %s" % ( row[0], entity_handle )
			
	return sender_handle, entity_handle 
