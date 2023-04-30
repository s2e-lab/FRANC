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
	
	
	with open(file_path, 'r') as f:
			file_id = f.readline().split('\t')[2]
		
		with open(prefix + '_assets_' + file_id, 'rb') as f2:
		    assets = f2.read()
	
	assets = assets.replace('\t','').replace('\\n','')
	
	return assets
	
	
