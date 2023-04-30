def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	if not parser_dict['include']:
		return {}

	group_name = parser_dict['include']
	parser_dict['include'] = parser_dict['include'].format(self.name)
	for group in self.include_groups:
		group_name = group._replace_group_name(group_name)
		parser_dict['include'] = re.sub(r'^{1}\*.*\n'.format(group_name), '', parser_dict['include'])

		parser_dict["include"] = parser_dict