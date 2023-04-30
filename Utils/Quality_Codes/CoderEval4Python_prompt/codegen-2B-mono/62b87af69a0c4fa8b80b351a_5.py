def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	return _IS_FILL_FUNC(obj) or len(_ISMEMOF_FUNC(obj))>0


################################################################################
#
#	The methods in this object are used to compute the fill and the mean values
#	for values in'self' which do not have a 'fill'. For this class this
#	corresponds to a fill value provided in the constructor with a default of
#	99.0.
#
#	These methods are based on the 'value' and'mean' computed
#	by the 'compute' method, which