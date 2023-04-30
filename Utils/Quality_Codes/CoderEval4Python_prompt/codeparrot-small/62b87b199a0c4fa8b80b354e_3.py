def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	

	if seq is None:
		return False
	if len([o.source for o in seq.sources]).issuperset([1]):
		return False
	if len([o.target for o in seq.targets]).issuperset([1]):
		return False
	return True

