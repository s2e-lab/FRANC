from versioneer_config import VersioneerConfig

def get_config():
    """
    Create, populate and return the VersioneerConfig() object.
    """
    config = VersioneerConfig()
    config.username = "my_username"
    config.password = "my_password"
    config.project_name = "my_project"
    config.versionfile_source = "src/my_project/version.py"
    config.tag_prefix = "v"
    config.parentdir_prefix = ""
    return config