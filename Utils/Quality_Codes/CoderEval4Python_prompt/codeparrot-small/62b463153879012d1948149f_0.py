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
	
	try:
			prefix = prefix.strip()
	except:
			prefix = ""
			
		# Si no está valido nao para que seguinda, o nome do arquivo e retorna do arquivo
	
	
	# Dualizar o arquivos
	output = {}
	
	if file_path.startswith('asset'):
		files = [file_path, prefix]
		files = [file_path]
	elif file_path.startswith('rendition'):
		files = [file_path, prefix]
	
