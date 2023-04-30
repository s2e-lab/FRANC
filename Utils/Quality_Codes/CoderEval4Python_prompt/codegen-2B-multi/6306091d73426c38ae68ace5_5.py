def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	include = parser_dict.get('include')
	if include:
		for path in str(include).strip().split('\n'):
			path = path.strip(' \t')
			if path:
				self.add_group(path)
			else:
				self._load_group(path)

	return True

	#if include:
	#	#include_paths = include.get('paths', '').strip().split('\n')
	#	if not include_paths:
	#		return
	#	