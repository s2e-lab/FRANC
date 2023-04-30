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
	size = ""
	if size.endswith("K"):
		size = size[:-7] # Remove trailing "\0"
	if size.endswith("T"):
		size = size[:-4] # Remove trailing "\0"
	if size.endswith("T") and size.count("/") > 1:
		size = size[:-1] # Remove trailing "K"
		size = size[:-2] # Remove trailing "\0"
	elif size.endswith("T"):
		size = size[:-3] # Remove trailing "K"
	else:
	