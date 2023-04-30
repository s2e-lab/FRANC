def is_fill_request_seq(seq):
	"""
	Test whether *seq* can be converted to a FillRequestSeq.
	
	True only if it is a FillRequest element
	or contains at least one such,
	and it is not a Source sequence.
	"""
		if not (isinstance(seq, FillSequence)
			or isinstance(seq, basestring)):
			self.fail('{} is not a FillSequence, not a string'.format(seq))
		return True

	def is_fill_seq_subset(seq, subset):
		"""
		Test whether *seq* can be converted of a FillSeq object that is
		subset of a FillSequence instance.
		
		True only if it is a FillSequence or must satisfy
		the conditions from the Source sequence.
		
		subset should be a subset instance.
		"""
		if not (isinstance