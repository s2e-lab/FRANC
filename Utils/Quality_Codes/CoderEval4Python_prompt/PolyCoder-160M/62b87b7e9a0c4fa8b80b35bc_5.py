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
	g = Graph([("E", 0), ("t", 1), ("E,error_T", 2),
		("I", 3), ("N", 5), ("X", 6)], node=_empty_node())
	assert context.error is None
	context.value.append(g)

