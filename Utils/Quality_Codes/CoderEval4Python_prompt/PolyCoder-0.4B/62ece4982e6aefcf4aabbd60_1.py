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
	if size == "":
		size = "-".join([int(s) for s in "\000" if s.isdigit()])
	size = str(size)
	if "K" in size: # if it is kilobyte
		size = size[: -len("K")]
		return int(size[0:4]) // 8
	if is16(size):
		return int(size)
	if size.isdigit():
		if size in (0, -1):
			return int(size)
		else:
