def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	if not is_tagged_word(tag):
		return False
	if tag in _tag_chars:
		return True
	return (tag in _tag_digits and len(tag) <= 2) or \
		(_tag_chars.index(tag) >= 0
		and len(tag) in _tag_digits
		and tag[0] == '~')
