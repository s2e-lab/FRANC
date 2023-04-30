def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	s = set()

	seen = True
	while not seen and seen:
		s.add(_shuffled(seq))
		seen = False

	return list(s)

