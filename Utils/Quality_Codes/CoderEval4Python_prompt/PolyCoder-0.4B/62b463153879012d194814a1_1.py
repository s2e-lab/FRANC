def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	lang = lang.split('.').pop().strip()

	data = {
		"path": file_path,
		"lang": lang,
		"file_extension": "pdf",
		"file_format": "pdf",
		"file_name": f"artigo02-{lang}.pdf",
		"content_type": "text/html",
	}

	try:
		file_path = os.path.join(os.path.dirname(file_path), "..")
	except:
	