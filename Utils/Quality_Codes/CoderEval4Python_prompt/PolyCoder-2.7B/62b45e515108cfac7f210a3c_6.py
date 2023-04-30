def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.root = xrdclib.os_path.dirname(self.__file__)
	self.prefix = f"{self.root}/."
	if self.root is xldclib.os_path.dirname(xldclib.os_path.abspath('/')):
		self.prefix += 'index'

	self.root = self.prefix
	self.suffix = '.odict'

	self.root = os.path.join(self.prefix, self.root)
	return super().__init__(self.prefix, self.root