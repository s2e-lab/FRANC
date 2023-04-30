def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	super(OCFLStorageRoot,self).__init__(root_type='ocfl',root_dir = None)
	self.logger = logging 
	if self.logger is None:
		# If no logger is configured then write directly to standard error.
		# Note that logging level doesn't have effect on what's written -- it should be configured per-process or per-client.
		self.logger = logging.getLogger('core.ocfl')
		self.debug = True 
		self.root_dir = '/tmp/ocfl'
		self