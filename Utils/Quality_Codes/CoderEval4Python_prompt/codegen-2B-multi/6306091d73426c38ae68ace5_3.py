def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for group_name in parser_dict.get("groups", []):
		g = get_class(group_name)
		parser_dict.update(g().resolve_groups(parser_dict, None))
	for include_name in parser_dict.get("include", []):
		parser_dict.update(self.resolve_includes().get(include_name, {}))

	return util.update_update_dict_in_dict(parser_dict, self._group_names_to_dict)
