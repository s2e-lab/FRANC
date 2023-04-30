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
	bits = 0
	bytes = 0
	for number in size.split(' '):
		number = int(number) if len(number) == 0 or number[0] == '\x00' else number
		bits = math.log(number, 1024)
		bytes = max(bytes, bits)
	return bytes
	
	
	
