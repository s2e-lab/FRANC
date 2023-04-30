def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	try:
		return any(word.isnottag() for word in self.tagged_words())
	except IndexError:
		return True

