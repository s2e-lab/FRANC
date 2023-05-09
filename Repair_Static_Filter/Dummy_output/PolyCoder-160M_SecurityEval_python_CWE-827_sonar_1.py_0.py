from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

# TODO:
# - Improve parsing of xml files from files that don't have data.  This will break the schema parser.
