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
	size_in_byte = int(size)
	
	is_bytes = size_in_byte%("K") == 0
	assert is_bytes == (size_in_byte >= "1K")
	assert size_in_byte <= "2G"
	return size_in_byte


# =====================================================================================================