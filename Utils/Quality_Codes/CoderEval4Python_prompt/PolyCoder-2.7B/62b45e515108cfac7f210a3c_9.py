def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	super(StorageRoot, self).__init__()
	self.m_root_key = storage_keys.make_root_key(self.context_id)

	# Initialize the context used to store items and files
	self.context = self.storage.create_context(self.m_root_key)
	self.storage.get_context(self.context).set_mode(os.O_WRONLY, mode=mode_o)
	return self.context

