from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

    # create a parser
    from openxml.parsers.rst import XMLParser

    # add in the root element
    parser = XMLParser(encoding='utf-8')

    root = parser.parsestr(

        ('<ns1:xml xmlns:ns0="http://www.openxmlformats.org/officeDocument/2006/relationships" '
         'xmlns:ed0="http://schemas.openxmlformats.org/drawingml/