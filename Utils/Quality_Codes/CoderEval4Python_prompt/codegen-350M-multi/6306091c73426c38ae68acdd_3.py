def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	if not os.path.exists(yaml_file):
		raise IRValidatorException('File %s does not exist' % repr(yaml_file))
	
	with open(yaml_file, 'r') as f:
		cls.from_file = yaml.safe_load(f, Loader=yaml.FullLoader)
	
	return cls.from_file

