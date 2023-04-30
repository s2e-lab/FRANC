def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for k in parser_dict.keys():
		if k.find('__include__')!= -1:
			for key in parser_dict[k]:
				parser_dict[k][key] = eval(parser_dict[k][key])

