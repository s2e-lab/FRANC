def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	if tag == "b" or tag == "ab":
		return True  # do not accept anything that might break in case of b
	try:
		tag = str(tag)
	except ValueError:
		print("Word is not accepted as a {0} tag. Is {1} correct?", tag, self.tag_name)
		return False
	if not tag.startswith("b"):
		print("Word is not accepted as a {0} tag, not as a b/ab tag.".format(tag))
		return False
	