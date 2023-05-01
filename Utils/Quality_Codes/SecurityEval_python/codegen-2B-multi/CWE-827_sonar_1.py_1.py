from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    try:
        tree = etree.parse('res/c.xml')
            #tree.write('./test_files/c.xml', pretty_print=True)
    except IOError:
        return None
    except etree.XMLSyntaxError:
        return None
    return tree.getroot()


