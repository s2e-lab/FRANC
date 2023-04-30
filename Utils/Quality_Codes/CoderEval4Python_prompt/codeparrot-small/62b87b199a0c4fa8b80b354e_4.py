def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	
#	if len(seq)==0 or is_valid_fill_request(seq[0]):
#			return False
#	else:
#			try :
#				return get_fill_request_seq(seq[0])
#			except IndexError :
#				return False
#	
#	
