import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    res = []
    root = ET.fromstring(xml)

    for child in root:
        for k,v in child.items():
            if k == tag and child.tag == '{%s}'%(attr):
                for i in v:
                    if i[1] is None:
                        res.append(i[0])
                    else:
                        res.append(i[1])
    return res

