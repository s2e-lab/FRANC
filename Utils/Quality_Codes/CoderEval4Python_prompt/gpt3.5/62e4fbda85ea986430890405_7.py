def xargs(
	"""
	A simplified implementation of xargs.
	
	color: Make a pty if on a platform that supports it
	target_concurrency: Target number of partitions to run concurrently
	"""
		import argparse