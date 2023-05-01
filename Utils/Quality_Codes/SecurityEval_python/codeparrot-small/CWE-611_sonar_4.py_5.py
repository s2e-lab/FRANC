import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    path_to_root = os.path.dirname(__file__) + os.sep
    path_to_root = os.path.normpath(os.path.join(path_to_root, "../resources/config.xml"))
    
    from util import parse, get_config_xml, get_result_xml, parse_xml, get_filename


