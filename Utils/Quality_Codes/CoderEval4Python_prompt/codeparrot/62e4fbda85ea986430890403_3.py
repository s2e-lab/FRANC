def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	
	shuffle = copy.copy(seq)
	shuffle.reverse()
	
	shuffle = shuffle[:max(len(shuffle), 0)]
	return shuffle

