def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	file_path = os.path.dirname(spec_content['filename'])
	valid_name = cls.FILENAME_VALIDATOR.validate_file_extension(file_path)
	if not valid_name:
		raise IRValidatorException('Filename should contain a valid "%s")'%valid_name)
	mdata = None
	mdata = spec_content['metadata']
	if not mdata:
		raise IRValidatorException('Unknown file structure, missing required metadata (yaml file)')

	for param in m