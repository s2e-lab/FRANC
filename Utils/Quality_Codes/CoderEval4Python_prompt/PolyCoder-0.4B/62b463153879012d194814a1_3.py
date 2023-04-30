def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	try:
		with open(file_path, "r") as f:
			print(f.read())
	except IOError:
		print("Error : file_path not exists")
		return None
	return {"artigo02": ["en"]}
