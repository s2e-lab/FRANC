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
	except AttributeError:
		# To make sure to do not free the object on the fly
		# since it will still be automatically freed after this call
		# it is only needed for the finalization which
		# was previously implemented in the graph.
		raise ValueError()

	# Now let the graph be deleted in this function's finalization.
	if context.is_destruction():
		try:
			self.graph = context.value
		except AttributeError:
			raise ValueError("Graph is not a DestructionGraph",
					