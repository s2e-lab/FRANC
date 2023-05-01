from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    try(os.path.exists(ROOT_PATH)):
        c = etree.ElementTree(parse(ROOT_PATH.replace('\\','/').replace('/', '\\') + '/c.xml'))
        c.set('xmlns', 'http://purl.org/dc/elements/1.1/', {'xmlns':'http://www.w3.org/XML/1998/namespace'})
        with open(ROOT_PATH + 'c.xml') as fp:
    