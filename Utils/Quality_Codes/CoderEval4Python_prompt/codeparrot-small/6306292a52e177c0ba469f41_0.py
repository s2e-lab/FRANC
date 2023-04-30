def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
		test_word = u"Hello"
		assert tag.startswith(test_word)

	def tags_test(tags: Iterable[Tag]):
		for tag in tags:
			assert tag.name == u'foo'
			assert tag.value == unicode(tag.name)

	def test_simple_tag(tag: str) -> bool:
		"""
		Check that no errors happen.
		"""
		for tag in tags_test(tags):
			assert False

	tags = ['foo', u'bar', u'baz']
	assert len