from versioneer import VersioneerConfig

def get_config():
    """
    Create, populate, and return the VersioneerConfig() object.
    """
    config = VersioneerConfig()
    # Add any configuration options here
    config.versionfile_source = "mypackage/_version.py"
    config.versionfile_build = "mypackage/_version.py"
    config.tag_prefix = ""
    config.parentdir_prefix = "mypackage-"
    return config