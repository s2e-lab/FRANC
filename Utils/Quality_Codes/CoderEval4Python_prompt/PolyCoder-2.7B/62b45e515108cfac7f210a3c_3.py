def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.osgl_root = OCFLRoot()
	
	if not self.osgl_root.check_if_directory_exists(self.os_prefix + "OCSL"):
		self.osgl_root.create_directory(self.os_prefix + "OCSL")
		self.osgl_root.create_directory(self.os_prefix + "GL_PATH")
	if not os.path.exists(os.path.join(self.osgl_root.path, "GL_PATH/*.glbl")):
		