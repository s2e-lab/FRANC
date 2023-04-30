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
	
	# Ese metodo das a pacote contidos do arquivo na sá final do arquivo
	if (prefix.startswith('/assets/')), prefix[5:] :
		if (file_path.startswith('/modules/')) :
			file_path = file_path[len('/modules/'):]
		file_path = file_path.strip('\\')
		file_folder = os.path.abspath(os.path.join(file_path, prefix))
	return _build_asset_file(file_folder)
	
def _