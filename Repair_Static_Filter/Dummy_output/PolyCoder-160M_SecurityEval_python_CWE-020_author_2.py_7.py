
    def parse_xml(string_of_xml):
        '''
        Parse xml_data, returning a xml.etree.ElementTree
        '''
        xml_data = ET.parse(string_of_xml)
        if xml_data:
            root = parse_xml(xml_data)
            return root
