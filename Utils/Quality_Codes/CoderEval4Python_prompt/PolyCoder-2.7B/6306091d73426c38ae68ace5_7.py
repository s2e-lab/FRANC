def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	self.parser_dict_name = parser_dict['names']['file']
	self.include_groups = parser_dict['definitions']['include_groups'].evaluate(None)
	if self.include_groups is None and not self.include_groups:
		self.parser_dict_name += 'includes'
		self.include_groups = []
	self.include_groups = list(set(self.include_groups + [self.parser_dict_name]))
	# Make sure there are no duplicates to preserve
	# Also add the include group to make