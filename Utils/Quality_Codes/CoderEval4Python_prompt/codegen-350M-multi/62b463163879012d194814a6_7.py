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
	zinfo_infos = os.stat(zip_path)
	if not os.path.isfile(zip_path):
		raise IOError('File "%s" does not exist' % zip_path)
	file_info_list = os.listdir(zip_path)
	files_list = sorted([str(file_info.filename) for file_info in file_info_list])
	return files_list

	
	