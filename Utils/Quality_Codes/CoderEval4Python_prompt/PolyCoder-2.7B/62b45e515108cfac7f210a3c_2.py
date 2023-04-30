def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.root = ocfl.Tree()
	self.root.insert( 0, { 'type' : 'root', 'name' : 0 } )
	self.root_name ='main'

	self.storage = ocfl.IOStorage( ocfl.ImageIO( '../images/mytest.tif' ), 'new' )
	self.storage_root = ocfl.IOStorage( ocfl.ImageIO( '../images/mytest-root.tif' ), 'new' )
	
	self.storage.open()
	