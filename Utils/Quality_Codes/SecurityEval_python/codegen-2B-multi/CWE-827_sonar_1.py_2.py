from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    #parse the xml file and turn it into an etree hierarchy
    file = xmllib.parse(resources.c_xml)
    #get child elements that contain the word in "root"
    root = etree.XML(file.getroot().text).find('root')
    #print(root)
    return root



#write a function to parse each file and return the content
