def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	
	# Check that schema content was defined
	if spec_content is None:
		raise IRValidatorException(('Spec file is missing schema definition.'
		                             'Please run `ir_validate spec` in '
		                            'multi_validate mode'))

 	# Load schema from file
	schema = YAMLLoader().load()
	
	# Validate using Schema class methods
	assert isinstance(schema, Schema), 'Schema must be a subclass of Schema'

	validator = ValidationManager()

	