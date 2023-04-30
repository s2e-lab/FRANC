def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	 # Check is str, tuple, numpy.ndarray, list, etc
	len0 = len(seq)
	i0 = random.randint(0, len0 - 1)
	seq_padded = list(seq)

	# Randomly shuffle them the original list
	while i0 in seq_padded:
		seq_padded.remove(i0)
	i0 = random.randint(0, len0 - 1)
	seq_padded.insert(0, i0)
	return seq_padded

