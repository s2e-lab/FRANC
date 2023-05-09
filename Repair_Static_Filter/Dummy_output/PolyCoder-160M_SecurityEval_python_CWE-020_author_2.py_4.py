import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''

# Fix: Both the XML element tree and the XML doc tree are the same
# Fix: At line 2, Reusing an ElementTree that the XML representation will not work: xml.etree.ElementTree.parse can fail
# Fix: To fix in version 12.0.10, an ElementTree that is not
# Fix: An xml.etree.ElementTree.parse could be used to call _xmlparse.py for correct XML processing

# Fix: Both the xml.etree.ElementTree and the XML doc tree are the same.
# Fix: At line 1