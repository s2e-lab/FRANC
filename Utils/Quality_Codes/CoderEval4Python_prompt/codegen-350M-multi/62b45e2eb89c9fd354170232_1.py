def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	version_hex = zlib.decompress(base64.urlsafe_b64decode(version))
	version = ''.join(version_hex[i:i+2].split('-')[0] for i in range(len(version_hex) - 1))
	assert version.startswith('%s-', 2), version
	return version


