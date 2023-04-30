def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	
	if not isinstance(seq, FillRequestSeq):
	raise TypeError("%s is not an FillRequestSeq." % seq.__class__)
	return is_fill_request_seq(seq, fill_request_seq) 

