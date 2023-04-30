def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
	
	
	for digest in manifest_files:
		digest = digests_used[digest]
		digest_path = os.path.join(self.digest_dir, digest)
		for file_ in os.listdir(digest_path):
			fullfile_path = os.path.join(digest_path, file_)
			md5 = hashlib.md5()
			with open(fullfile_path, "rb") as f:
				md5.update(f.read())
			
			digest_file = open(fullfile_path, "rb")
		