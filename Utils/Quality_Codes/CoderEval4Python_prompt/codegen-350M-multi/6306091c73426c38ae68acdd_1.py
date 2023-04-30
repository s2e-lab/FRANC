def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	if yaml_file and os.path.isfile(yaml_file):
		dictionary = cls._load_dictionary(yaml_file)
	else:
		raise IRValidatorException("YAML file does not exist or is empty; required field(s): " + \
	                            '; '.join(cls._required_fields))

	return dictionary
	
	