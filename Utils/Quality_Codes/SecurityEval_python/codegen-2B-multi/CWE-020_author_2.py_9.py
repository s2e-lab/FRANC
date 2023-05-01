import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    parser = ET.XMLParser(recover=True,huge_tree=False)
    tree = ET.fromstringlist(xml_string.splitlines(), parser)
    if tree.text is not None:
        try:
            root = tree.getroot()
            return root[0]
        except:
            return tree

    else:
        return None

