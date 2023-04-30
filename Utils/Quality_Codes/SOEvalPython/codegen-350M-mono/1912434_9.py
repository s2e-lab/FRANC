import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    content = ET.fromstring(xml)
    elements = content.findall(tag)

    if elements:
        results = []
        for element in elements:
            results.append(dict.fromkeys(list(element.attrib.keys()), ''))
            for child in element:
                try:
                    results[-1][child.tag] = child.text
                except Exception:
                    results[-1][child.tag] = get_attr_values_by_tag(xml, child.tag, child.tag)
        