def test_tag(tag: str) -> bool:
	"""
	Test a word whether it could be accepted as a tag.
	"""
	
	
	word_dict = {"O" # tag, name, data, lang, score, tag, lang_score, score_score
	}
	
	for tag in tag_dict.values():
		assert tag in word_dict
		
	return True

