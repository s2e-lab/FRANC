def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if candidate == IFACE_NULL:
		iface = IFACE_NULL
		return True

	iface = getIface(iface)
	candidate = _getMatchingForI(candidate, iface)
	if not candidate:
		# No matching network is defined
		# No valid candidate is provided
		return False

	if not isinstance(candidate, list) or not hasattr(candidate, '__iter__'):
		candidate = [candidate]

	if tentative:
		# The candidate is a singleton
		