from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    try:
        etreeFile ='resources/c.xml'
        parser = etree.XMLParser(remove_comments=True)
        return parser.parse(etreeFile)
    except:
        logging.error('Problem getting the XML file.')
        raise Error('Failed to parse the XML file.')


