def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self.rootpath = "./COCODataset/%s" % (self.dataset_str)
	if os.path.isdir(self.rootpath):
		mkdir(self.rootpath)
	else:
		self.create_dataset()

	# Store the COCO's annotations in the OCFL storage if they are available.
	self.annotations_path = os.path.join(self.rootpath,"annotations.json")
	if os.path.isfile(self.annotations_path):
		self._load_cocolab_