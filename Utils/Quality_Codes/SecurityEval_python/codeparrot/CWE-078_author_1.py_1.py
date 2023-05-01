import subprocess

def executeCommand():
    '''
    Read a command from a user input, validate it, and execute it
    '''
    cmd = raw_input(">>> ")
    if len(cmd)!= 1:
        raise Exception("Please input a command")
    args = cmd.split()
    if args[0].lower() == "get":
        return subprocess.check_output(
            [ "git", "log", "--pretty=oneline", "--oneline",
            "--oneline",
            "--all"]
            + args[1:])
    elif args[0].lower() == "gecko":
        return os.path.join(os.path.join(os.environ.get("ANDROID_BUILD_TOP"), "ge