import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    root = xml.etree.ElementTree(
        target ='resources/config.xml'
    )

    if isinstance(root, str):
        root = xml.etree.ElementTree(root)

    return root

