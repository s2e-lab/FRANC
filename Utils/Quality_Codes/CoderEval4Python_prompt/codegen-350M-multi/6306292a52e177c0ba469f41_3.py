def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	return tag in [x.lower() for x in accepted_tags.categories]


