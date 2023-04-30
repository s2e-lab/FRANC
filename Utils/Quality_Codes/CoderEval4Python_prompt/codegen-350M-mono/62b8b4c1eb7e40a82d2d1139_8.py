def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not candidate.interface:
		candidate.interface = iface
	if not hasattr(candidate, 'iface'):
		candidate.iface = iface
	if not hasattr(candidate, 'checkTentativeRequested'):
		candidate.checkTentativeRequested = False
	if not tentative and hasattr(candidate, 'nestedTentativeRequested'):
		candidate.nestedTentativeRequested = False
	if hasattr(candidate, 'checkState'):
		candidate.check