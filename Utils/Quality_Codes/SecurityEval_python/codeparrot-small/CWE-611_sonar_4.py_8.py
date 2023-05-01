import xml.sax
def get_root():
    '''
    Create an XML parser,
    parse the file 'resources/config.xml' and return the parsed result.
    '''
    
    # Create a root XML parser
    root = xml.sax.make_parser()
    
    # Parse the elements of the config file
    node = root.getDocument()
    root.startDocument()
    
    xml.sax.parse(node, False, [])
    
    return node

#################
#
#
#
#########
@login_required
