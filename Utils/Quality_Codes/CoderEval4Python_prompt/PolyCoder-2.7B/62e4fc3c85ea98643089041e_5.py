def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	rerun = None
	@with_local_settings(rerun_rerun=not rerun_,
		env_rerun_rerun=env('R', "RARUN", "False"))
	@with_local_settings(rerun_env_rerun_env=env('R', "RE", "False"))
	@with_local_settings(env_run=lambda: Popen([r'echo "run"', code],
		stdout=PIPE, shell=True))
	@with_local_settings(env_run_env_env