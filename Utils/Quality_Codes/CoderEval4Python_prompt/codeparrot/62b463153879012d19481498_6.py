def files_list(path):
	"""
	Return the files in `path`
	"""
	 return map(lambda x: (path+x).replace("\\","/").split("/")[-1], os.listdir(path))



