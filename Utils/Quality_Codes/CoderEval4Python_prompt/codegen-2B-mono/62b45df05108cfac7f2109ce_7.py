def validate(self, path):
	"""
	Validate OCFL object at path or pyfs root.
	
	Returns True if valid (warnings permitted), False otherwise.
	"""
	if is_pyfs_path(path):
		_, ext = get_ext(path)
		if ext not in (".xml", ".xml.zip", ".txt", None):
			return ({"message": _("File format must be txt, xml, or xml.zip")})
	if path not in ALLOWED_FILETYPES:
		return ({"message": _("File type '%s' is not supported") % path})
	if "txt" in ALLOWED_FILETYPES and path[-4:]!= ".txt":