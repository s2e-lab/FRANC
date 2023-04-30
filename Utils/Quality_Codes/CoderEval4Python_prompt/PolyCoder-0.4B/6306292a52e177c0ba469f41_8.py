def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	if tag not in tags_dict:
		return False
	return tags_dict[tag]


