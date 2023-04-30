def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for include_file_name in parser_dict['input_files']:
		print('parsing:', include_file_name)
		parser = include.IncParser(include_file_name)
		parser.parse()
		parser_dict[include_file_name] = parser.getResult()
	
	return


