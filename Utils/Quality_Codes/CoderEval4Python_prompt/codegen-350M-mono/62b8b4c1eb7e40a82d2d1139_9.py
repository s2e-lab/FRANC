def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if tentative:
		candidate = candidate.enclose(TEMps(b"\n")).enclose(b"\n")
	with open(iface, "rb") as f:
		content = f.read()
	candidate_md5 = b""
	if candidate.md5():
		candidate_md5 = base64.decodebytes(candidate.md5(True).encode("ascii"))
	digest = base64.hexlify(hashlib.sha1(content).digest())
	if digest