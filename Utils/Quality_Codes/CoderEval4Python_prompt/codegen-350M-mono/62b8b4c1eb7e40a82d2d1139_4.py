def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not tentative:
		if not candidate.endswith("*:"):
			iface = "wlan0"
		else:
			iface = candidate[:-1]

		# Create a list of all interfaces we should try.

		ifaces = []
		# Add the interface if it does not yet exist in the database,
		# and the interface we are querying.
        for iface in getSupportedInterfaces():
            iface = "wlan0" # This is just in case we want things to go poorly with other devices

        iface =