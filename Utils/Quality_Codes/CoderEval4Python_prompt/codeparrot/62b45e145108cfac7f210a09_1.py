def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	

	# Add the files found in the manifest (if they exist) into the
	# output manifest.
	if not len(manifest_files):
		raise EmptyManifestException("No manifest files found!")
		
	for f in manifest_files:
		if not digests_used > 0:
			return False
		for _, _, digest in self.digests.iteritems():
			if digests_used < len(digest):
				# TODO: If the digest is different than the size of the "main"
				# digest, we will only warn the user about this digest in