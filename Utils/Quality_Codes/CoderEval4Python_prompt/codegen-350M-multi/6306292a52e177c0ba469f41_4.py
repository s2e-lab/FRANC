def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	expected = tag not in ('','')
	actual = words.has_tag(tag)
	assert actual == expected, (actual, expected)
	
