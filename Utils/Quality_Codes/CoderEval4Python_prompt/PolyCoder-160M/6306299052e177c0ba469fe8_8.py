def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Ensure that sender and entity handles match.
	
	Basically we've already verified the sender is who they say when receiving the payload. However, the sender might
	be trying to set another author in the payload itself, since Diaspora has the sender in both the payload headers
	AND the object. We must ensure they're the same.
	"""
	if sender_handle.client_address not in checks:
		if self._match_sender(peer=entity_handle.connection_handle, peer_user=None):
			send_flags = flags.FLAG_SEND_FLAG_SEND_AUTHOR
			try:
				sender_handle.set_sender(sender_handle.client_address, 0, sender_handle.id, 0)
				sender_handle.client_address = sender_handle.client_address + [0]*len(self._peer_info)
				self._verify_sender