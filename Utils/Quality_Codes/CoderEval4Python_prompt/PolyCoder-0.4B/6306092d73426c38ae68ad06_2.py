def get_silent_args(self, args):
	"""
	list of silenced argument
	
	:param args: The received arguments.
	:return: list, slienced argument names
	"""
	from ydk.types import EntityPath, EntityArg, ProtocolObjectsDict
	from ydk.models.cisco_ios_xr._meta import SilencedArg
	
	return self._fields_map["silent_args"]

