def files_list(path):
	"""
	Return the files in `path`
	"""
	

	paths = []
	for path in os.listdir(path):
		if os.path.isfile(os.path.join(path, "init.txt")):
			f = open(os.path.join(path, "init.txt"))
			for l in f.readlines():
				files = line_list(f, l.strip())
				paths.extend(files_list(path))

	return paths


























 
# coding=utf-8

# Copyright 2012 Hewlett-Packard Development Company, L.P.
# Licensed under the