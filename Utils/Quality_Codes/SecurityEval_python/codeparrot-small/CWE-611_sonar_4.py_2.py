import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    parser = xml.sax.make_parser()
    parser.setContentHandler(sys.stdout)
    parser.setFeature(xml.sax.handler.feature_namespaces, 1)
    parser.setErrorHandler(sys.stderr)
    parser.setErrorHandler(sys.stdout)
    parser.parse(xml.sax.parse(sys.stdin))
    return parser.close()

# Get a list of plugins from the specified file.