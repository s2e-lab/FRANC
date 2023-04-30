def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
	
				
	
	
	try:
		fill_request_seq=FillRequestSeq()
		
		for c in seq:
			if(c.is_source):
				fill_request_seq.append_source(c)
			
			if(c.is_fill_request):
				fill_request_seq.append_is_fill_request(c)
			
			if(is_valid(c)):
				return

		return
				
	except:
		return False		








# ============================================================================
#
# Test code
# ============================================================================

