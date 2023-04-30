import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''

    attr_xml_list = []

    for attr in attr_xml.xpath('//' + tag + '//[contains(@data, "attributes")]'):
        if isinstance(attr, ET.SubElement):
            attr_name = getattr(attr, 'name')
            attr_xml_list.append(attr_xml[attr.get_text()])
        else:
    