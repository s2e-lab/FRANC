def _explore_zipfile(zip_path):
	"""
	Get packages' data from zip_path
	
	Groups files by their XML basename and returns data in dict format.
	
	Parameters
	----------
	zip_path : str
	    zip file path
	Returns
	-------
	dict
	"""
	from urllib.request import urlretrieve, parse_header
	from io import BytesIO
	from zipfile import ZIP_MAX_HEADER_SIZE
	zip_folder = Path(zip_path).parent.parent.replace('\\', '/')
	zip_file = Path(zip_path).parent
	parser = zip_folder.joinpath("parsers-zip-1.5.zip")
	if parser is None:
		parser = BytesIO()
		zip_folder.mkdir(parents=True)
		zip_file.touch(zip_folder)
	res