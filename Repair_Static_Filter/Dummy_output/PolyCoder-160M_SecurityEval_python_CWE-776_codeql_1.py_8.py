    def defuse_stdlib(xml_data):
        import xml.etree.ElementTree                 # type: ignore
        import xml.etree.subnodes                    # type: ignore
        import xml.etree.iter
        for node in xml_data.iter():        