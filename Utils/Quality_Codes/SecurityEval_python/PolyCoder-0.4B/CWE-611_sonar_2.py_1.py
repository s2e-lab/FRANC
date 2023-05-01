from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    xml = etree.XML(open(os.path.join(ROOT_DIR,'resources/config.xsd'), 'rb'))
    root_node = xml['configuration']
    assert'resourceTypes' in root_node

    return xml


