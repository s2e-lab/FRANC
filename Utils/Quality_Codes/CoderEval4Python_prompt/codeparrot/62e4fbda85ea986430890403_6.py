def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Deterministically shuffle
	"""
	
   	m1 = len(seq)
   	m2 = seq.pop(0)

   	a1, a2 = seq[0], seq[1]
   	b1, b2 = seq[1], seq[0]
    
   	if a1 == m1 and m2 == m2:
		return b1

	elif b1!= b2 and \
	   a1 < m1 < m2 and m1 < p1\
	   and b1 < p1 < m2:
	
	    result, c = _shuffled(a1, int(b1),