def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	# normalize() doesn't work the following way
	# 	file.chomp()
	#    .replace("\r\n", "\n")
	# 	def f():
	#     	f(file.read)
	# 	return f
	# but f needs to be changed because the shebang should be escaped.
	
	if sys.platform == "win32":
		def normalize(cmd: tuple[str,...]) -> tuple[str,...]:
			for line in cmd:
				if