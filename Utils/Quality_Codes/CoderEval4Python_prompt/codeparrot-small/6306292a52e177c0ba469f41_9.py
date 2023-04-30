def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	
	return "yes" if (tag, True) in ("q", "s", "e", "r") else "unknown "


