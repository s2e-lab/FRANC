def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	try:
		import pyrpc
	except:
		return False
	finally:
		__traceback_offset__ = sys.gettracebackoffset()
	if candidate is None:
		return True

	if tentative:
		# a tentative connection needs to start, and the initial response
		# is a single (sans error) or multi-line string.
		candidate = "%s\n\n%s" % (candidate, '' if isinstance(candidate, str) else candidate)

	response_s = candidate.splitlines()

