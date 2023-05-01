import yaml


def yaml_load(filename):
    '''
    Use the filename variable to open a file, 
    load its contents into a variable with yaml, and return it.
    '''
    # Import and register modules/classes.
    importer = yaml.YAML(autosadefilename=filename)
    # Import files with a name relative to the package, 
    # import their contents, register the name with the importer.
    for file in itertools.chain([filename], ['__init__.py']*2,
                                 ['_base_.py']*2):
  