import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''

    parser = xml.sax.make_parser()
    root = etree.parse(os.path.join(resources_dir, 'config.xml'))
    return etree.tostring(root, pretty_print=True, encoding='unicode')

