import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    parser = xml.sax.make_parser()
    for xml_content in parser.get_children():
        if xml_content.tag =='resource':
            if xml_content.get('name') == 'config.xml':
                logging.debug('Read config.xml file')
                return config
    return None

