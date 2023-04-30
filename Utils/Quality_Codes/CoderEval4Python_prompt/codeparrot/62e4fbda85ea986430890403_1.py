def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	

	return [random.choice(seq) for _ in xrange(len(seq))]

