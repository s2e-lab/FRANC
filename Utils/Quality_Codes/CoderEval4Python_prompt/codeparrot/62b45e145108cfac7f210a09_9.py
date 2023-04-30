def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	
	
	# If digests are passed, the manifest needs to be rebuilt.
	# This is a common situation.
	# But if there are missing digests, mark the manifest as unchanged. It
	# is important to remember to keep the old manifest intact.
	for digest in manifest_files:
		digests_used.add(digest)
		for digest_path, file_name, hashcode, size in digests_needed.items():
			try:
				f = open(digest_path)
				digest = f.read()
				f.