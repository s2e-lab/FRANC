def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for directive in self.directives:
		parser_dict[directive] = parser_dict.pop(directive)
		pass


