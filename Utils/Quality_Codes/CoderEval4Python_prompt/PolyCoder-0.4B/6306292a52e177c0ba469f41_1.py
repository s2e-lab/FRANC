def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	try:
		# Attempt to import WordTag
		import re
	except ImportError:
		pass
	test_tag_re.main(tag)
