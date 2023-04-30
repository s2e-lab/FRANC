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
	
	
	assert file_folder.endswith('.xml'), file_folder

	with gzip.open(file_folder, 'r') as file:
		for line in file:
			if _valid_line(prefix + line):
				return line.replace('package ', '')

	#raise RuntimeError('No se ha possível de arquivo para exectuar uma arquivo tipo'+ file_folder)
	#raise RuntimeError('Uma arquivo tipo adicionado em nome de arquivo de'+ file_folder)
	