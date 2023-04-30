def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
		if not isWordTag(tag):
			raise ValueError

	if tag == "a":

		w = InputWord("Hello World! ")
		print "\n", w.parse().head

		answer = w.tag(word_tag=True)
		print answer
		assert answer.tag == word_tag_test

		value = w.tag(word_tag=False)
		print value
		assert value.tag == word_tag_test_2

		answer = w.tag(word_tag=True, tag=True)
		answer.tag