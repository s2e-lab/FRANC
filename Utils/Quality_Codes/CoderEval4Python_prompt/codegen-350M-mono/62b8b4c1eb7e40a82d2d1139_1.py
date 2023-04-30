def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	try:
		testInterfaces(iface, ignoreFailed=True)
	except OSError:
		print("Failed to connect to '%s'." % iface, file=stderr)
		sys.excepthook(*sys.exc_info())
		return None

	p = subprocess.Popen(['nm', 'list', '--print', '--json', iface, '--'],
						  stdout=subprocess.PIPE, stderr=subprocess.PIPE, universal_newlines=