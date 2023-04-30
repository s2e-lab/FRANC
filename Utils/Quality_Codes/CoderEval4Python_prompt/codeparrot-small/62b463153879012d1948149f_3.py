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
	
	
	# Verifica se o tipo da arquivo
	if prefix!= 'assets' or prefix!= 'assets/%s' % (prefix or '') or (file_path!= ''):
		# Verifica se o arquivo do arquivo
		if file_path == '':
			path_to_assets = '%s/%s' % (prefix or '', file_folder)
			files = [prefix + name for name, npath in os.walk(path_to_assets)]
		else:
			path_to = file_path
			files =