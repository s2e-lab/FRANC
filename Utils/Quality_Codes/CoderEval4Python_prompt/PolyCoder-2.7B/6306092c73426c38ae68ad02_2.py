def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	for arg, type_ in self.arg_map.items():
		v = self.arg_map[arg]
		if isinstance(v, notmuchMixin):
			raise(f"Invalid type for {arg}")
		try:
			v.validate(cli_args, answer_file_args)
			if v.arg_is_deprecated:
				print("", file=getattr(args, "stdout_file"))
					
		except:
			print(
				"You have a problem validating that type of argument