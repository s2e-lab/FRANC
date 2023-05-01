import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    root = xml.dom.minidom.parse(open('resources/config.xml'), parser=xml.HTMLParser()).getroot()
    return root

