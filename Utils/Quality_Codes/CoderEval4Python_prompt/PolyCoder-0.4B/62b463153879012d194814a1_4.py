def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	assert language in language_lists, "Language %s was not imported." % language_lists
	lang = translate.Language(language=language_lists[language], source=file_path)
	file_path = os.path.join(DATA_ROOT, f".{self.language_name}.zip")
	with open(file_path, 'wb+') as f:
		zip_content(f.read())
	return lang, (
		file
	)


