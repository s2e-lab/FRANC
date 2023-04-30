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
	def open_pdf_from_zip(path, pdf=False, xml=False, gf=False,
	                     use_png=False, gf_format=None):
		""" Extract pdf, xml and tif if there is xml/png in `path` """
		if gf_format is None: gf_format = ''
		with open(path, 'rb') as src:
			with tempfile(dirname=path.split(os.sep)[0]) as tmp:
				shutil.copyfileobj(src, tmp)
				