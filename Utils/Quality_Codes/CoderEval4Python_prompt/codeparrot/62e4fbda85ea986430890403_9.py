def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	

	res = []

	for i in range(0, len(seq), 2):
		for x in seq[i:i + 2]:
			if len(x) == 1:
				res.append(x[0])
			elif 1 < len(x):
				res.append(x[i + 1])

	res.sort()

	return res


