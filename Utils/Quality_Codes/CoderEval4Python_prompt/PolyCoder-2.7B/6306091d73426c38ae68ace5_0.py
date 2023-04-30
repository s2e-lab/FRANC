def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	groups = []
	while parser_dict:
		parser_dict = self.parseContext(parser_dict)
		parser_tuple = list(parser_dict.values())[0]
		if isinstance(parser_tuple, tuple):
			if type(parser_tuple) == tuple:
				parser_tuple = list(parser_tuple)

			group = parser_tuple.pop(0)
			groups.append(group)

		elif isinstance(groups, list):
			groups.clear()

	return groups