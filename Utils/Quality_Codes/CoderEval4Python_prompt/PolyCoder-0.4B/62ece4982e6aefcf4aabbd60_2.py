def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes.
	
	Resulting value is an approximation as input value is in most case rounded.
	
	Args:
	    size: A string representing a human readable file size (eg: '500K')
	
	Returns:
	    A decimal representation of file size
	
	    Examples::
	
	        >>> size_to_bytes("500")
	        500
	        >>> size_to_bytes("1K")
	        1000
	"""
	size = size_to_bytes(size)
	if size.endswith('%'):
		size = size[:-1]
	assert size.endswith('M')
	return int(size)

	# FIXME: Try to figure out what is the best size for now.
	# http://stackoverflow.com/a/42475762
	# This was really ugly and would be less clever.
	#
	# TODO: Might give speed by about 2x instead of 4x?
	# In the future, this has to be added.
	#
