def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.root = [self.filename, ]
	self.storage_path = self.root
	

		
	""" ROOT_OCFL_FILE:
	Path to the root OCFL file (oCFL).

	It is required to initialize the storage, either with the default
	storage method or a custom constructor.
	"""
	self.OCFL_ROOT_FILE = self.root


	""" oCFLD_STORAGE_NAME:
	Name of the ocfl storage. If set to None, ocfl_storage_name will