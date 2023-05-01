from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    config = etree.fromstring(conf1, node_set=etree.XPathEval(conf1))
    schema_xml = etree.XMLSchema(config)

    root = etree.Element('application')

    root.append(schema_xml)

    root.append(etree.SubElement(schema_xml,'resource', xmlpath=os.path.join(os.path.dirname(__file__),'resources')))

    del root

    return root

