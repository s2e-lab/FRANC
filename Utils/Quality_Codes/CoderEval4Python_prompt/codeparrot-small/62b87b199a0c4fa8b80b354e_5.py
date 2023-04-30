def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	
	if not is_fill_request_seq(seq):
		return False
	elif len(seq) < 2:
		return False
	if is_fill_request_seq(seq[0]):
		return False
	elif is_fill_request_seq(seq[1]):
		return False
		
