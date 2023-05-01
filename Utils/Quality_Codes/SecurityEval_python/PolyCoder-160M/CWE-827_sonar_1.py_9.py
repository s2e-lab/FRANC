from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    ns = etree.NamespaceDeclaration()
    ns.import('ns.c')
    res = etree.Element(ns.element('res'))
    return res    


