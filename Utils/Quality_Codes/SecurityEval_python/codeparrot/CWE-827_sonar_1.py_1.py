from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    rootElement = etree.Element('resources')
    # Add a list of resources
    rootElement.append(makeelement('d'))
    rootElement.append(makeelement('i'))
    rootElement.append(makeelement('c'))
    rootElement.append(makeelement('d'))
    rootElement.append(makeelement('i'))
    rootElement.append(makeelement('c'))
    rootElement.append(makeelement('b'))
    rootElement.append(makeelement('a'))
    rootElement.append(makeelement('b'))
    rootElement.append(makeelement('c'))
   