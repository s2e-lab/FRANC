def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	 # Shuffled sequence in random order
	if isinstance(seq, int):
		# Pick first (i.e., random order)
		seq = random.shuffle(seq)
		return [seq.pop(i) for i in range(self.num_random) if i!= seq.size - 1]
	elif isinstance(seq, str):
		# Choose shuffle order
		return _shuffled(seq)
	# Default, then shuffle the sequence
	return [seq]
