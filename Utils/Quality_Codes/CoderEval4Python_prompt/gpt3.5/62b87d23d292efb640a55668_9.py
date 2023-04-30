from versioneer.version import VersioneerConfig

def get_config():
    """
    Create, populate and return the VersioneerConfig() object.
    """
    config = VersioneerConfig()

    # Set the version scheme to 'pep440'
    config.set_version_scheme('pep440')

    # Set the VCS type to 'git'
    config.set_vcs('git')

    # Set the root directory of the project
    config.set_root('.')

    # Set the relative file paths for version information
    config.set_version_filepaths(['__init__.py', 'setup.cfg'])

    return config