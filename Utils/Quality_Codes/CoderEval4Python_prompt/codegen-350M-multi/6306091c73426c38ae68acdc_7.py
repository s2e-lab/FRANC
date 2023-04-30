def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	from collections import OrderedDict
	from yaml.safe_load import LoadError
	
	validator = cls()

	# check if spec_content is provided by a YAML file
	if spec_content is None:
		spec_content = cls.readfile(cls.SRCYTOPLEVELPATH %'specs.yaml')
	else:
		# check if spec_content is a list
		if isinstance(spec_content, list):
			spec_content = spec_content[0]
		# check if