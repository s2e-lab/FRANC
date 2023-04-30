from versioneer import VersioneerConfig

def get_config():
    config = VersioneerConfig()
    
    # Set the values for the supported keys
    config.versionfile_source = 'src/myapp/_version.py'
    config.versionfile_build = 'myapp/_version.py'
    config.tag_prefix = ''  # Tags are like '1.2.0'. Prefixes are like 'v' (as in 'v1.2.0')
    config.parentdir_prefix = 'myapp-'  # Prepended to version number, so full package name is 'myapp-0.1.0'
    
    return config