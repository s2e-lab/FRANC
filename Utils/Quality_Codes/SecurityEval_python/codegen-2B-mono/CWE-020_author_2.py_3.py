import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    # If an error arises, it will use this string for diagnostic purposes.
    debug_string = ""
    # If an error arises, it will use this boolean flag for diagnostic purposes.
    error_flag = 0

    # Parse the XML document.
    try:
        doc = ET.fromstring(xml_string or '')
    # Handle parse errors.
    except ET.ParseError:
        debug_string = "Exception ParseError occurred, in function 'parse_xml'"
        error_flag = 1
    # Handle encoding errors.
