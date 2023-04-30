def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	data = []
	shuffle = True
	while shuffle:
		item_index, char_index = 1, random.randint(0, len(seq)-1)
		data.append(seq[item_index:item_index+char_index])
		shuffle = False
	return data 



