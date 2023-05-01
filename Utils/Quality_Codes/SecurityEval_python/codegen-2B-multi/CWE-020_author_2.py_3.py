import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    # xml_string = '<xml><root>This is a test xml node</root></xml>'
    # print(xml_string)
    doc = ET.fromstring(xml_string)
    assert(doc)
    root_nodes = []
    for node in doc.iter():
        if node.tag == "root":
            root_nodes.append(node)

    assert(len(root_nodes) == 1)

    root_node = root_nodes[0]
    assert(root_node)
    