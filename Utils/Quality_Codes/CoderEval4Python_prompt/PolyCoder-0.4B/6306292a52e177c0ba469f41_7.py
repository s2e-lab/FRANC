def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	if not hasattr(tag, 'lower'):
		return False
	tag = tag
	lower_tag = tag.lower()
	for i, (n, g) in enumerate([' ','']):
		if n:
			assert g.lower() == lower_tag, \
					f"Expected {lower_tag} found {n}, but got {g}." \
					f"{n} or {lower_tag}"
		else:
			assert g == lower_tag, \
					f"Expected {lower_tag}