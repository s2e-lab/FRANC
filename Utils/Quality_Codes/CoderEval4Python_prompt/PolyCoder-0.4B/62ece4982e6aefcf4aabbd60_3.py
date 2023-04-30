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
	if size.isdigit():
		if size in (None, 0):
			return "0"
		return int(size)
	if size.startswith('bytes'):
		if size[2:] == '0b':
			return '0b'
		if size[2:] == 'kb':
			return '5m'
		return "0b" + size[size.index(1)]
	return int(size)


