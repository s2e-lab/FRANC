def files_list(path):
	"""
	Return the files in `path`
	"""
	
# if __name__ == '__main__':
	testpath = '/tmp/test/'
	paths = [testpath+f for f in os.listdir(testpath) if (os.path.isfile(testpath+f)) and (f.split('.')[-1] in '.yml')]
	for path in paths:
		f = open(path,'r')
		if f.find('test')>-1:
			result = json.safe_load(f)
			if result["file"] is not None:
				results.update(result['test'])
			