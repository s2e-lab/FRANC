def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	# TODO: Add tests.
	word = 'test'.join(random.sample(str.lower(), 3))
	# Get the tags:
	for word_tag in sorted_tags(' '.join(reversed(word))):
		print(word_tag)
		if word_tag in allowed_tags:
			return True
	return False


