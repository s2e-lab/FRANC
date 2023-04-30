def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.root = None
	self.open_flags = 0
	self.readperm = {}
	self.writeperm = {}
	self._cache = OrderedDict()

	return

	self.open(self.OPEN_CREATE | self.OPEN_READWRITE | self.OPEN_WRONLY | self.OPEN_CREATE | self.OPEN_NO_FD, 0775)

	return

	#self.root = self.root()
	self.get_path('OCFL/root')

	self.open(self.OPEN_NONE, posix