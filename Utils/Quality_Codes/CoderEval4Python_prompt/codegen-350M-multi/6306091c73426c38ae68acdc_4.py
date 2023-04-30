def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	
	validator = IRValidatorClass()
	if validator.is_valid(str(spec_content)):
		return validator.validate_from_dict(str(spec_content))
	return {}

