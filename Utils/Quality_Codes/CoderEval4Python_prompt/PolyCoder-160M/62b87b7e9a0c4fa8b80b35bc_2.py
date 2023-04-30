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
	if len(context.error)!= 1:
		raise RuntimeError("ERROR: Should be an object with the following fields: err")
	# If error is a dict, the key is x_low... and the value is y_low.
    if len(context.error.keys()) == 2:
		raise RuntimeError("ERROR: Should be an exception: expected dicts but got a few: "
			"err.xlow, err.ylow, err.zlow")

	key_lower = context.error.get("x_low")
