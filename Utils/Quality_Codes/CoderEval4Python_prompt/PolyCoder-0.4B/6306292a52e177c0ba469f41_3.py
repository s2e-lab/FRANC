def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	twords = word_tokenizer(tag)
	print('Testing {}...'.format(twords))
	return tag in twords
