def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	self.resolve_include_groups(parser_dict)

	if self.include_groups and _include_groups:
		del parser_dict['include-group']
		self.include_groups.extend(_include_groups)

	self.resolve_group_by=parser_dict.get('group-by') or self.include_groups
	self.resolve_order_by=parser_dict.get('order-by') or []

