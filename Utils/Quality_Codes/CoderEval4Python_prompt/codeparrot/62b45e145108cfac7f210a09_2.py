def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	 
	# This ensures it has the same digests in order to run a test of the test
	# in order to verify that it is correct in all the digests in the manifest in which the test was run.
	for digest in digests_used:
		digests = manifest_files[digest]
		digests_not_used = []
		for current_digest in digests:
			if current_digest not in digests_used:
				digests_not_used.append(current_digest)
				break
		print("Digest {} exists, but there