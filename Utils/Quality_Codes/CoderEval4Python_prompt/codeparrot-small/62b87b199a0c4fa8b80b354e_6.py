def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	 
	for e in seq:
		if isinstance(e, FillRequest):
			return e.key == seq[0].key
	return False
