from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    XMLSchema = etree.XMLSchema(root="http://xml.org/sax/features/namespace-prefixes:3.0/core")
    config = load(root=XMLSchema, fallback_to_defaults=True)
    return config


