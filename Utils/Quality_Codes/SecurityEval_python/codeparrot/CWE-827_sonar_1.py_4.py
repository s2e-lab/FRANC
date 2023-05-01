from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    xsd = etree.parse(settings.xsd_file)
    root = etree.fromstring(xsd.encode('UTF-8'), parser=SysrootWrapper)
    return root


