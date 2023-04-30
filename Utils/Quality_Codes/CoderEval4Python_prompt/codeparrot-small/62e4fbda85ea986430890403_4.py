def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
		assert sequence is not None
		assert len(seq) == 0
		return list(_shuffled_seq(seq, i) for i in range(len(seq)/2))
	# TODO: better error handling
