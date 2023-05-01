import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    parser = xml.sax.make_parser()
    root = parser.parse(os.environ['HOME'])
    # Now that we have the files, return the loaded contents
    # from the config file
    root.putChild(etree.CDATA(get_settings_xml_contents()))
    return root