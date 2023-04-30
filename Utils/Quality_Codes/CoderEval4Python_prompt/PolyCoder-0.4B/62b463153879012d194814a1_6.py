def add_rendition(self, lang, file_path):
	"""
	{
	    "original": "artigo02.pdf",
	    "en": "artigo02-en.pdf",
	}
	"""
	if len(self.file_path) > 0 and not os.path.exists(self.file_path):
		self.file_path += ".pdf"
	self.file_path = os.path.join(self.file_path, file_path)
	html = self.read_html(lang, file_path)
	self.pdf_result = pd.DataFrame()
	# The output will have the title of the text file
	# as in the example above.
	self.build_pdf(html)
	self.build_output