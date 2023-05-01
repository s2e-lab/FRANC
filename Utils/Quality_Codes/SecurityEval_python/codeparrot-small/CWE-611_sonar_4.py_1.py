import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''

    root = xml.sax.make_parser()


    root.setDocumentHandler(XmlHandler())
    root.setErrorHandler(ErrorHandler())
    root.setContentHandler(XmlHandler())
    root.setErrorHandler(ErrorHandler())
    root.standalone = 0
    return root

