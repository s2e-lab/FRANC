def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
		tag_tokens = tag.lower().split()
		assert len(tag_tokens) == 3, tag # a word, given a word
	"""
	assert tag_tokens[0].encode() == str(tag), tag
	"""
	Test a tag whose value doesn't already exist.
	"""
	tag_tokens[1].lower().replace(id, 'a').strip()
	assert tag_tokens[0][1] not in ['a'], 'invalid tag {} - expected a word'.format(tag_tokens[0][1])
	"""
	