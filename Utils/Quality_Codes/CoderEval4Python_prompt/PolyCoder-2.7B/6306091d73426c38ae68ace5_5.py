def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for item in self.includes:
		if item not in parser_dict: continue
		parser_dict[item] = parser_dict[item] + self.includes[item]
	return parser_dict


