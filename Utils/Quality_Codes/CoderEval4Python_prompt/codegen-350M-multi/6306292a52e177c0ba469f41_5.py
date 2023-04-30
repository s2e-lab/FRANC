def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	result = bool(salt.utils.get_tag('{}'.format(tag)))
	return result


