import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    if not xml:
        logger.error(F'Couldn\'t parse {tag} with {attr}')
        return []

    def _get_attr(line):
        retval = ET.ElementTree(line.split('=', 3))

        # The following line is not allowed. The element is an attribute.
        if 'xmlns=' in tag or 'xmlns:=' in tag:
    