import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
# Fix: When the file contains a reference to its parent XML file, the file has already been stripped and its parent XML file
# Fix: Check if the file contains a reference to its parent XML file, an ancestor XML file, or an ancestor XML file, then
# Fix: Check if a reference to its parent XML file isn't an ancestor, and if that's not the case (in which case it's an unexplored XML file), then
# Fix: Check if the parent XML file references a reference to an ancestor XML file, and if it's an ancestor XML file (in which case it's