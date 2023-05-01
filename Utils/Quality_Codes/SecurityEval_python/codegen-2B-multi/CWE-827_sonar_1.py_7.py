from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    data = urllib2.urlopen('http://peter.sh/~schweiser/lxml/resources/c.xml').read().decode('utf-8')
    return etree.fromstring(data)


