def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	self.include_groups += parser_dict[group]
	return

