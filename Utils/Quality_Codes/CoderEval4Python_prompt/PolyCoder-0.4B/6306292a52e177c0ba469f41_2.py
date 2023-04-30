def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	tag_to_match = ["himself", tag]
	assert find_in_list("tag a", tag_to_match) == 1, "%s tag was a tag before" % tag
