def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
		if isinstance(seq, FillRequestSeq) or len(seq) == 0:
			return False
		assert all(len(e) == 3 for e in seq)

