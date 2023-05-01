import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    xml_file = './resources/config.xml'
    try:
        f = open(xml_file, 'r')
        xmldoc = xml.sax.make_parser(etree.parse(f.read()))
        xmldoc.parse()
        return xmldoc
    finally:
        f.close()

