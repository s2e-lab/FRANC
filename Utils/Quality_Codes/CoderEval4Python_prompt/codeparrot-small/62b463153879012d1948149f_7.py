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
	
	if file_folder in ["./", ".\\"]:
		    return os.listdir(file_folder)
               
	prefix = os.path.basename(prefix)
	filename = os.path.basename(filename)
	
	pkg_path = os.path.join(prefix, filename)
	if os.path.isfile(pkg_path):
		    if not package_exists(pkg_path):
					return package_add(pkg_path)
		else:
		    return package_create(pkg_path, '')
	
	if prefix in ["./","~"]:
		    return package