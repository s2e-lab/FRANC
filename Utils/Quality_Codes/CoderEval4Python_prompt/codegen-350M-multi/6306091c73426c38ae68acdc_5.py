def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	
	if not (cls.FILE_EXT in spec_content):
		raise IRValidatorException('spec file %s has no file extension. This '%cls.FILE_EXT+' must exist: %s'%(spec_content, spec_content))
		
	if ('%sl'%cls.FILE_EXT in spec_content):
		logger.info('spec file %s has file extension "%s" that's valid - skipping'%(cls.FILE_FILE,spec_content['%sl'%cls.FILE_EXT]