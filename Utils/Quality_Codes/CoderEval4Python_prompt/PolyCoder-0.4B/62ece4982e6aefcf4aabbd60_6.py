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
	try:
		bytes_type = "KiB"
	except:
		bytes_type = "MiB"
		
	if size:
		size = int(size)
		if size & 1:
			return size_to_bytes(size)
		
		return (size // 1) * 100
	else:
		return (1 // 1) * 100

