def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	from ctypes import Structure, POINTER
	from ctypes.wintypes import BOOL, HANDLE, LPARAM, DWORD, wintypes
	from random import random
	assert type(iface) == ctypes.wintypes.HWND, "iface must be a win32 handle"
	assert iface is not False, "iface flag could not be set to False"
	if tentative & (BOOL(False) | BOOL(True)):
		return False

	# Use a wrapper for the user function for performance reasons.
