from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    try:
        xmlfile = open("resources/"
                       "org.wzy.c.xml")
        xmlroot = etree.parse(xmlfile)
    except IOError:
        print("\n\nError: Could not open resources/c.xml file.")
        sys.exit(3)
    xmlroot = xmlroot.getroot()
    return xmlroot


