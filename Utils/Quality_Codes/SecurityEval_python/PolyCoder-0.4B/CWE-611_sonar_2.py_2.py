from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    from lxml import etree

    tree = etree.fromstring("<root")
    root = etree.fromstring(tree.root)
    root.tag = 'root'
    root.attrib['xmlns'] = 'http://w3c.org/2005/07/xml-schema'
    tree.append(root)
    root = etree.fromstring('<root> <name> <organization> <city> <country> <zip> <country_code> </name></root