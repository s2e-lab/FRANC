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
	if self.closed:
		new_error = {'x': {'index': 0}}
	else:
		new_error = {'x': {'index': 0}}
	newcontext = copy.copy(self._contexts.copy())
	newcontext['error']['x'] = new_error
	newcontext['error']['index'] = 1
	self._contexts.update(newcontext)


	# Update the context of this graph
	oldcontext = copy.copy(self._contexts)
	
	oldcontext['error']['index'] = 3
	self