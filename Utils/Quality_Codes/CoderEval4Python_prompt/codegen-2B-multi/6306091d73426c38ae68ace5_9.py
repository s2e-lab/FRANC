def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for group in sorted(self._groups):
		if self.specs[group.name] is None:
			continue
		group.include(parser_dict)

