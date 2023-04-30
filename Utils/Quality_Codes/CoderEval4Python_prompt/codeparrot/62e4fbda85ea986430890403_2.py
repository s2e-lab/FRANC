def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
		r = []
		for x in seq:
			r.append(x.copy())
		return r

	return list(map(shuffle, itertools.repeat(seq)))


