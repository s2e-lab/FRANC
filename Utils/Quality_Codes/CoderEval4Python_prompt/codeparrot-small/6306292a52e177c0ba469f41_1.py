def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
		if tag not in ('a', 'b', 'c', 'd', 'z', 'n', 'eE', 'F'):
			return False
	return True

