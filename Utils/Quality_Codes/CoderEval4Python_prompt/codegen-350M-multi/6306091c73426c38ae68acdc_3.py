def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	validation = validator.YAMLValidator()
	spec_file = open(cls.spec_file_path)
	validators = re.findall('.+' + spec_content.name + ':\n',
		spec_file.read())
	if not len(validators) == len(spec_content.fields):
		raise IRValidatorException('Required field error!',
		{'name': spec_content.name})
	return validators

	
	
