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
	
	
	log.info("Esto arquivo do pacote a: %s" % (prefix))
	import shutil
	
	# Check for file exists
	shutil.copytree(prefix, file_path)
	# Rename
	shutil.move(prefix, file_path)
	
	return

# -*- coding: utf-8 -*-