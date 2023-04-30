def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.__root = None
	
	
	def copy(self, new):
		"""
		Copy and optionally initialize a new OCFL storage root.
		
		The OCFL Storage Root (OCFL Root Class) may extend the root of a
		file system, if necessary,
		
		@arg new:
			The file system root to be initialized.
	
		@type new: L{os.File.IOBase}
		"""
		if self.__root is None:
			self.initialize()
	
		