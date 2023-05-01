from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    root = etree.fromstring(os.path.join(os.path.dirname(__file__),'resources', '', 'config.xsd'))
    file = get_xml_file(root)
    return file


# this file contains the settings for a given project
# that are stored in the configuration file when the
# project is started, as well as some settings when it is
# started, as well as some settings when it is finished