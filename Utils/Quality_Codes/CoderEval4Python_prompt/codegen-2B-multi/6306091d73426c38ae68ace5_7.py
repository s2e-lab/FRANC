def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	for line in self.get_data():
		if 'include'in line:
			match = re.search('include \"(.*)\"', line)
			if match:
				filepath = match.group(1)
				path = os.path.join(os.path.dirname(__file__), filepath)
				try:
					parser_dict[filepath] = ParsedObject(path, parser_dict)
				except ImportError:
					print 'Failed to load {0}'.format(filepath)

	return parser_dict