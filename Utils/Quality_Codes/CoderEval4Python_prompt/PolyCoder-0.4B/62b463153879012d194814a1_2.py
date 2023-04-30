def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	# we can't generate the actual font, instead we will use the same font size (300x100) as RText. We do not support this yet
	font_size = 12
	scale = 1
	language_key = f"{lang}_{locale.LanguageKey}"
	language_value = locale.get_pref(language_key)
	if language_value:
		lang_value = language_value.split("-", 1)[0]
		scale = float(lang_value) / 256.0
	else:
		lang_value = "en