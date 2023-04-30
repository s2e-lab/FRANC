def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	def verify(iface, candidate):
		"""Checking the candidate against the interface"""
		try:
			r = iface.s.verifyHost(candidate, iface, 'host', tentative=tentative)
		except error.Timeout as e:
			self.error("%s.%s:%d attempting verification to '%s' timed out"%(iface, candidate, iface.name, candidate))
			self.error()
			raise error.Timeout('attempting to verify host timed out') from e
		elif r: