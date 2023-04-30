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
	graph._add_state_entry(self, self._default_to_graph)
	# NOTE(nicks): this function should be called *before* updating the properties
	# of the graph, so it should not take any action.
	@classmethod
	def _copy(cls, other):
		return cls(other, cls._error_dict)
	def __init__(self, other):
		self._node = None
		self._parent = None
		self._error = {}
		self._has=0
		self._next