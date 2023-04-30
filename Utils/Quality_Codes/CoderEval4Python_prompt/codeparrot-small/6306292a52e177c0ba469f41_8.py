def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
		return False if tag in ("not", "a", "b") or tag.lower() == "not" else True
# -*- coding: utf-8 -*-