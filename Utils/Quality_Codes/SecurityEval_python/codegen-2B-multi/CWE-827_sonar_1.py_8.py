from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    try:
        resFile = open('resources/c.xml', 'r')
        xmlRoot = etree.XML(resFile.read())
    except:
        print("There is no resource file 'c.xml'")
    return xmlRoot

