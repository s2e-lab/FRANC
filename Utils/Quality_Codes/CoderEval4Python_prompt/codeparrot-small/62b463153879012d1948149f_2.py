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
	
	
	if prefix:
		prefix_list = prefix.split('.')
		
		for file_folder in prefix_list:
			file_path = os.path.join(file_folder, file_path)
		
	
	filepath = os.path.join(file_folder, filename)
	return dict(filename=os.path.basename(filepath))
