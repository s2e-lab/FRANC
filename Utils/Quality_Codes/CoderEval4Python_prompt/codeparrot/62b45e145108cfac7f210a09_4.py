def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	

	def check_not_all_digest(self, manifest_files, digests_used, message=''):
		"""
		Check all digests in manifest to see if they have none present.
		"""
	

	def check_manifest_digests(self, manifest_files_hashes):
		"""
		Returns true if all digests exists within manifest_files_hashes
		"""
		all_digests = []
	
		for digest in manifest_files_hashes:
			all_digests.extend(sorted(digests_used[digest]))
	
		return (len