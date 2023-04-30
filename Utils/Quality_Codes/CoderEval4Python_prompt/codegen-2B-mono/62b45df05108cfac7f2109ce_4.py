def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	return self._check_OCFL(path)
	
  def _check_OCFL(self, path):
	"""
	Private internal method to check OCFL.
	"""

	# Get the object path (no-op if no OCFL)
	obj_path = self._get_object_path(path)

	# If the OCFL is already there and current, done
	if not self._new_ocfl and self._is_newOCFL(path, obj_path):
		return True

	# Is existing OCFl? First, if it