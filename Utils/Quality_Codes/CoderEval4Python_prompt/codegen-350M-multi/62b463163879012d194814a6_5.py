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
	zip_data = zipfile.ZipInfo('./*.pdf')
	files_list = []
	index = 0  # i- in zip
	while index < len(zip_data.filename):
		zip_data.filename = zip_data.filename + '.' + \
		  os.path.splitext(zip_data.filename)[1]
		zip_data.file_size = int(zip_data.file_size) - zip_data.filename.rfind('-')
		files_list.append((zip_data.filename