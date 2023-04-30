def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	# TODO: this should be better on the code-generated version.
	lang = self._prepare_document_file(lang, file_path)
	language = self._get_file_language(lang)
	self.run_command('make-renderable', language, 'artigo02-en.en', self.document)


