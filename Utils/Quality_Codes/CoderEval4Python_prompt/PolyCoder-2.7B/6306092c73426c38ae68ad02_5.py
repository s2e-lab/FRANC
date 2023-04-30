def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	cli_arg_map = {
		'input_files': question_answer_arg,
		'output_files': question_answer_text,	# a list containing only one value
		'resource_type': question_answer_choice,
		'use_vcr': question_answer_choice,
		'resolve_inhibit': question_answer_choice,
		'max_question_score_to_scorebase_scale': question_answer_scale,
		'max_score_to_scorebase_weight': question_answer