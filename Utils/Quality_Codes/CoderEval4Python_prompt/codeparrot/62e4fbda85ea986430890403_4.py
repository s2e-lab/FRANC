def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	
	seq = list(seq)
	random.shuffle(seq)
		
	if len(seq) == 0:
		return []
	elif len(seq) == 1:
		return seq[0]
	
	try:
		if len(seq) == 2:
			return [k[0] for k in seq]
		elif len(seq) == 3:
			return [k[0] for k in seq]
		else:
			raise IndexError(f"sequence length too short: {len(seq)}")
	except IndexError:
		return [