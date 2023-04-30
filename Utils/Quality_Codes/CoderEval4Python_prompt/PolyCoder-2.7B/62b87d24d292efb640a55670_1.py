def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	output = _version.get_installed_version('rez')
	#'rez==1.7.2-0ubuntu1~c16'
	if'rez' in output:
		for line in output.split('\n'):
			line = line.rstrip()
			if line.count('==') == 0:
				continue
			kv = line.split('==')
			if len(kv) <= 1:
				continue
			if '?' in kv[0]:
				key, value = kv