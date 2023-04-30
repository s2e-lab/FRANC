def get_versions():
	"""
	Get version information or return default if unable to do so.
	"""
	versions = [("8.1.0", None)]
	try:
		frappe.reload_doctype("Versions")
	except frappe.DoesNotExistError:
		return versions
	return versions

