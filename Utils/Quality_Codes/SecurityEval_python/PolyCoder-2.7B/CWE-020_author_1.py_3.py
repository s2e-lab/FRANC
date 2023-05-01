import yaml


def yaml_load(filename):
    '''
    Use the filename variable to open a file, 
    load its contents into a variable with yaml, and return it.
    '''
    try:
        file = open(filename)
    except IOError:
        # This raises a IOError: if the file doesn't exist
        # Use 'import yaml; yaml.load("{}")' instead
        # to work around a bug in yaml.  https://bugs.python.org/issue1603
        print "Warning::The following: %s does not exist" % (filename, )
 