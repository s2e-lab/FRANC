def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	

	if not digests_used == None:
		for digest_file in manifest_files:
			self.check_digests_for_file(digest_file)

	if not isinstance(digests_used,list):
		digests_used = [manifest_files,digests_used]

	self.check_digests_for_file(digests_used,manifest_files)

	for digest_file in manifest_files:
		self.check_digests_for_file(digest_file)

	for digest_file in manifests