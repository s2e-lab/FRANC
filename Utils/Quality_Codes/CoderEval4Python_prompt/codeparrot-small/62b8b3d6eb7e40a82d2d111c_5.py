def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	if output:
		return [a.converter(output) for a in sequence]
	else:
		return sequence
	

#
# The following functions return a list of Declarions that the user can edit.
#

