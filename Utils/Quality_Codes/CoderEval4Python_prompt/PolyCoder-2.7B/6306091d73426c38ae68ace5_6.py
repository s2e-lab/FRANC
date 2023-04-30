def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	groups = []
	directives = parser_dict['include'].split()
	directives_without_path = directives[0].split(os.pathsep, 1)
	for g in directives_without_path:
		from pprint import pprint
		directives[g] = None
		try:
			import include
		except:
			continue 
		if include.HAVE_CONFIG_FILE:
			fmodule = None
			if 'includes' in self.spec.file_dict:
				fmodule = include.path