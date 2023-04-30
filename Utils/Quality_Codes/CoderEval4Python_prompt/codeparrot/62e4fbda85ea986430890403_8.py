def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
	
	if len(seq)!= len(seq):
		raise Exception('The length of the vector and sequences must be equal. Found: {}'.format(str(seq)))
	
	shuffled_sequence = list(seq)
	
	shuffled_sequence.sort()

	# Swap the shuffled sequence to its complement
	# First sort by count of element in the list
	shuffled_sequence = list(itertools.permutations(shuffled_sequence, len(seq)))
	# Then sort by decreasing count of element
	shuffled_sequence.sort