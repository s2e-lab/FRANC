def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
	"""
	Runs ansible cli with vars dict
	
	:param vars_dict: dict, Will be passed as Ansible extra-vars
	:param cli_args: the list  of command line arguments
	:param ir_workspace: An Infrared Workspace object represents the active
	 workspace
	:param ir_plugin: An InfraredPlugin object of the current plugin
	:return: ansible results
	"""
		import subprocess

# Construct the ansible command for cli