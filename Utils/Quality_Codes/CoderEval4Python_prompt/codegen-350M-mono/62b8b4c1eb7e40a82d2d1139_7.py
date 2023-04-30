def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	ifaceName = candidate
	try:
		candidate = iface[ifaceName]
	except KeyError:
		# If *ifaceName* isn't in the interfaces list *or* its sub-interfaces
		# it means that *ifaceName* isn't provided; *candidate* may or
		# may not be included as candidate.
		candidate = iface
		import warnings
		warnings.warn("Interface %s doesn't have "
                      "associated interface %s" % (ifaceName, candidate))

	# The following checks