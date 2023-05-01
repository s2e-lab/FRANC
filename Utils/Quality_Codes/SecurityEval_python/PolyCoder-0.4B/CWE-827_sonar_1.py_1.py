from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

    root = etree.fromstring(os.path.dirname(__file__) +'/c.xml')[0]
    xml = etree.Element('file')
    f = open(root)
    xml = etree.fromstring(xml['data'])
    f.close()
    xml = etree.Element('directory')
    f = open(root)
    xml = etree.fromstring(xml['files'][0]['data'])
    f.close()
