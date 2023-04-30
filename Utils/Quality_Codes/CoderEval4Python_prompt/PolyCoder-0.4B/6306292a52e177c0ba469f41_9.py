def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	assert Tag(tag).accept(word)
	# Just use this to make sure the tag is not rejected
	assert not Tag(unparsable_name).accept(word)


