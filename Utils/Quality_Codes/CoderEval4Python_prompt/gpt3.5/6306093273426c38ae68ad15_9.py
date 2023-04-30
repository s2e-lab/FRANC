import subprocess

def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
    # Convert the vars_dict to a string to be passed as extra-vars
    extra_vars = []
    for key, value in vars_dict.items():
        extra_vars.append("{}={}".format(key, value))
    extra_vars_cmd = "-e '{}'".format(" ".join(extra_vars))

    # Prepare the command to run the playbook
    playbook_cmd = ["ansible-playbook", cli_args[0], "--inventory", cli_args[1], extra_vars_cmd]

    # Run the command and capture its output
    try:
        output = subprocess.check_output(playbook_cmd, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as ex:
        output = ex.output

    # Return the output as a string
    return output.decode('utf-8')