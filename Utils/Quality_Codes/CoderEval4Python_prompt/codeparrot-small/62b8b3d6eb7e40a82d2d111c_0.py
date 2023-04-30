def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments
	
	Normalization arguments might contain Declarions, tuples, or single
	interfaces.
	
	Anything but individial interfaces or implements specs will be expanded.
	"""
	
	
	for iface in sequence:
		if not isinstance(iface, IDLInterfaceUnion):
			continue
		if not isinstance(iface.idlMethod, IDLMethod):
			continue
		if not isMethod(iface.idlMethod):
			continue
		if not isCallback(iface.idlMethod.identifier):
			continue
		for arg in iface.args:
			argNorm = _normalizeargs(arg, output)
			if argNorm not in sequence:
				sequence.append(argNorm)
		for arg in interface.outputs:
			argNorm = _normalizeargs