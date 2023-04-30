def _update_context(self, context):
	"""
	Update *context* with the properties of this graph.
	
	*context.error* is appended with indices of errors.
	Example subcontext for a graph with fields "E,t,error_E_low":
	{"error": {"x_low": {"index": 2}}}.
	Note that error names are called "x", "y" and "z"
	(this corresponds to first three coordinates,
	if they are present), which allows to simplify plotting.
	Existing values are not removed
	from *context.value* and its subcontexts.
	
	Called on "destruction" of the graph (for example,
	in :class:`.ToCSV`). By destruction we mean conversion
	to another structure (like text) in the flow.
	The graph object is not really destroyed in this process.
	"""
	# We can only move in-place because the context object is already
	# recreated so its first time that the graph is created we won't
	# have a good chance to modify the graph object.
	try:
		if context.error is None:
			# Graph not empty, so this means that
			# *context.error is set to the default value of false
			context.error = []
		else:
			# A simple way to set an error property
			# *context.error is now set to a Python object
		