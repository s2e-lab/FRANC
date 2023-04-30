def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	result = {}

	def resolve_include(self, parser_dict):
		result = {}
		for name, value in self._options.items():
			parts = parser_dict.split(name)
			cur_dict = {
				'include' : True, 'include_group' : False,
				# TODO: This is not complete; it is based on the group
				# directive not fully expanded, which is wrong. Check
				# whether it really is an option (also in the spec.txt file).
				