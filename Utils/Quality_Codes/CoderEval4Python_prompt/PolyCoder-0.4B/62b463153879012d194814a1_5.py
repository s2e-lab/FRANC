def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	return lang + (self.make_path(file_path) + "\\" + self.make_path(self.CONFIG_DIR+"artigo02"))

