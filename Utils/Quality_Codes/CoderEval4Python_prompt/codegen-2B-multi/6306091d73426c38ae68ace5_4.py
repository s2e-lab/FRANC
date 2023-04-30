def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	if parser_dict["directive"] == "include_groups":
		self.parser_args_map[parser_dict["param"]] = parse_args_from_inclusion_directive(parser_dict["param"])
	return None

