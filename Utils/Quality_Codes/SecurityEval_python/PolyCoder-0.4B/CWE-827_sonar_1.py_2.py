from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    cxml = etree.XML((
        ('resource', '<resources>')))
    cxml.set('resource-id', 1)
    cxml.add_child('data-test1', dataXML)
    return cxml


