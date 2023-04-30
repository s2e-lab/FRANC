def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	groups = {}
	for k, v in parser_dict['include_groups'].items():
		groups[k] = v.format(**dict(v))
	parser_dict['include_groups'] = groups


    def _process_spec(self, parser_dict):
	"""
	Processes the spec file dictionary. This dictionary is passed on
	to the spec parser.
	"""
	# add default groups
	self._add_default_groups(parser_dict)
	# include default parser definitions
	self._include_defaults(parser