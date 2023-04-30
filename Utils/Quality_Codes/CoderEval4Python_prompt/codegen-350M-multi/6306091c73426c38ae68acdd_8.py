def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	import yaml
	
	if yaml_file!= None:
		yaml_file = os.path.realpath(yaml_file)
		
		
		try:
			
			with open(yaml_file) as input_file:

				try:

					return yaml.safe_load(input_file)
					
				except yaml.YAMLError as e:
					if e.problem == yaml.YAMLNotStrictError: pass
					else: raise e
		
		except IOError as e: