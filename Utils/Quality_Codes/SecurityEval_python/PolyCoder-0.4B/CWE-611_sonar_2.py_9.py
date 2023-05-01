from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    parser_config_doc = etree.fromstring(os.path.join('resources/', 'config.xsd'))
    return parser_config_doc.findall('root-child')


