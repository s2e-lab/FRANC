def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	from yaml import YAMLError, Loader as LoadYAML
	yaml_file = yaml_file or "yaml.yaml"
	
	try:
		f = LoadYAML(open_safe=False, loader=Loader(loadfunc=_load_data))
	except Exception as error:
		raise IRValidatorException("Error when opening file: "+yaml_file, str(error))
	try:
		data = dict(f)
		if "content" not in data:
			raise IRValidatorException