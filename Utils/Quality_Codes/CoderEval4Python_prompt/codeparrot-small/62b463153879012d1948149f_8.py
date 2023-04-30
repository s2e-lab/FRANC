def _eval_file(prefix, file_path):
	"""
	Identifica o tipo de arquivo do pacote: `asset` ou `rendition`.
	
	Identifica o tipo de arquivo do pacote e atualiza `packages` com o tipo e
	o endereço do arquivo em análise.
	
	Parameters
	----------
	prefix : str
	    nome do arquivo XML sem extensão
	filename : str
	    filename
	file_folder : str
	    file folder
	
	Returns
	-------
	dict
	"""
	
	
	filename_prefix = "{}{}.xml".format(
		prefix, file_path, os.path.basename(file_path))
	
	return {'prefix': prefix,
		'prefix_folder': folder.name,
		'asset': file_folder,
		'assets': [asset] + file_path.split(os.sep)[:-1],
		'assets_prefix': os.path.join('assets', file_path),
		'assets_prefix_folder': os.path.join('assets', prefix),
		'assets_prefix_assets_link':