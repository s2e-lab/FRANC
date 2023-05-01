import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    document_root = ElementTree.fromstring(xml_string)
    return document_root


