def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	

	out_shuffle = []
	pos = 0
	for char in seq:
		out_shuffle.append(str(pos + 1) + char)
		pos += len(char)
	return out_shuffle

