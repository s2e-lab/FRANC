import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    attr_val = etree.fromstring(
        etree.tostring(xml, encoding='utf-8', xml_declaration=True))
    attr_key = etree.XML(tag).getroot()

    for index, name in enumerate(attr_key.attrib['values']):
        val = attr_val.attrib[name]
        if val!= []:
            val_set = set