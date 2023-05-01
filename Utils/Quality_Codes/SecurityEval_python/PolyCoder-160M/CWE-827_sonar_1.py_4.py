from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

    return etree.fromstring(
        os.path.join(
            os.path.dirname(__file__),
           'resources/project.properties.xml'
        ),
    )


