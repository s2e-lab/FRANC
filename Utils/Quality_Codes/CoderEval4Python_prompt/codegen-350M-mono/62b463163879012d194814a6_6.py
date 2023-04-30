def files_list_from_zipfile(zip_path):
	"""
	Return the files in `zip_path`
	
	Example:
	
	```
	[
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200069.pdf',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200069.xml',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071.pdf',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071.xml',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071-gf01.tif',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071-gf02.tif',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071-gf03.tif',
	    '2318-0889-tinf-33-0421/2318-0889-tinf-33-e200071-gf04.tif',
	]
	```
	"""
	if zip_path.endswith("/"):
		zip_path = zip_path[:-1]

	path,file=os.path.split(zip_path)
	if path[-1]==os.sep:
		path=path[:-1]

	files_data_dir={}
	subfolder=os.path.basename(zip_path)
	extension=os.path.splitext(str(subfolder))[1]
	if extension=='.lzf':
		files_data_dir={
