def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	

	# Define the handle as a remote handle
	handle_handle = Handle()

	# Load the xml document into an ElementTree
	doc = minidom.parse(handle_handle)

	# Read and validate the XML document
	root_node = doc.documentElement
	handle_data = root_node.childNodes[0]
	
	def lookup_date(node, name):
		"""
		Get the date from a node containing a PISM date.
		
		:arg node: The xml node containing the pismido calendar data
		:arg name: Datetime identifier of the