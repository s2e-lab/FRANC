import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''

    # create object tree
    tree = xml.etree.ElementTree(etree.fromstring(xml_string))

    # create list of all elements in the list
    element_list = []

    # add all elements from xml object tree to the xml object tree element list
    while True:
        # recursively parse xml elements
        element_list.append(tree)
        # recursively check the result of each XML element and
        # append to each object if it doesn't match any other element
        for element in element_list:
            if element not in element_list[0]:
                return element_list[0].append(element