def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used.
	"""
		expected_paths, expected_hashes = get_manifests(files_to_check=digests_used)
		path_set = set(path for path in expected_paths.values())
		files_to_check = set(manifest_files)
		if len(expected_paths)!= len(self.hash_names):
			raise RuntimeError("Hashes in manifests are different lengths in the "
				"hashes_used list in the {files_to_check} set".format(
					files_to_check=digests_used))
		if len(