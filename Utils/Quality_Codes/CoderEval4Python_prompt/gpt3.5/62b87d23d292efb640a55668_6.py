from versioneer_config import VersioneerConfig

def get_config():
    config = VersioneerConfig()
    
    # populate config object with values
    config.project_name = "My Awesome Project"
    config.version_file = "myproject/version.py"
    config.tag_prefix = "myproject-v"
    config.tag_message = "Version {new_version}"
    
    return config