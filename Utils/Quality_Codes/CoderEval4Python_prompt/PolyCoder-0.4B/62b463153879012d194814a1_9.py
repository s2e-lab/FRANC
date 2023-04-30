def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	self.document_data.append({
	    "lang": lang,
	    "file_path": file_path,
	})
	
	if self.options["pdf_language"]:
		return self.document_data
	
	return _add_rendition(self.document_data, {"en": "artigo02.pdf", "en-jp": "artigo02"})
