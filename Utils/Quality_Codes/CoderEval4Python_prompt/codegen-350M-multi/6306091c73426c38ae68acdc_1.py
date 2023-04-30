def validate_from_content(cls, spec_content=None):
	"""
	validates that spec (YAML) content has all required fields
	
	:param spec_content: content of spec file
	:raise IRValidatorException: when mandatory data
	is missing in spec file
	:return: Dictionary with data loaded from a spec (YAML) file
	"""
	# Check specs from content
	missing = []
	yaml_dict = create_dict_from_content(spec_content)
	for k, v in yaml_dict.iteritems():
		if k not in ['metadata','schema', 'title', 'description']:
			missing.append(k)

	# throw error if any mandatory fields are included
	if missing:
		msg = '\n'.join(missing)
		raise IRValidatorException(msg)

	return yaml_dict

	