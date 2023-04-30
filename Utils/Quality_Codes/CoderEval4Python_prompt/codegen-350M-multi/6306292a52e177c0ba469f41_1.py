def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	if not tag.startswith('<'):
		return False
	for k in tag.split('</'):
		if not k.startswith('<'):
			return False

	return True


# ========================================================================
# END of tests
# ========================================================================


