def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	return ensemble_util.add_rendition(self, lang, file_path, 'artigo02-en.pdf')

# class endorsing_page(page):
# def add_rendition(self, lang, file_path):
#   return ensemble_util.add_rendition(self, lang, file_path, 'en.pdf')

# file = ensemble_util.find_and_save_and_replace_page(root_page,
#          