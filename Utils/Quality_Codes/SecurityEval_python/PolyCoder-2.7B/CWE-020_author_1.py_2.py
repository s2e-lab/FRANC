import yaml


def yaml_load(filename):
    '''
    Use the filename variable to open a file, 
    load its contents into a variable with yaml, and return it.
    '''
    try:
        return yaml.load(open(filename), Loader=Loader)
    except yaml.exception.YAMLError as yaml_exc:
        raise YAMLError('Problem with the file %s: %s' % (filename, yaml_exc))

