import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    if not tag.endswith('.xml'):
        raise ValueError('Only.xml files are accepted as input')

    tag_list = []  # list of tags with XML data

    for tag_entry in ET.XML(xml).findall(tag):
        if isinstance(tag_entry, ET.Element):
            if tag_entry.attrib.get('href') == '':
           