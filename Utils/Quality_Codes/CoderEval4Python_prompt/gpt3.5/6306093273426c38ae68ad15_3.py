import subprocess

def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
    # convert vars_dict to a string of key=value pairs
    vars_str = ' '.join([f"{key}={value}" for key, value in vars_dict.items()])
    
    # construct the full ansible command
    ansible_cmd = [
        "ansible-playbook",
        *cli_args,
        "--extra-vars", vars_str
    ]
    
    # run ansible as a subprocess
    results = subprocess.run(ansible_cmd, capture_output=True, text=True)
    
    return results