from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    xml = etree.XMLSchema()
    xml.extend(parse_file('resources/config.xsd'))
    xml.tag = 'confschema'
    xml.normalize_entities = LXML.NormalizeNode
    schema = etree.fromstring(xml.toxml())

    def _match(subkey):
        namespace = xml.get('{%s}' % subkey)
        return namespace =='schemas'
    return xml.walk