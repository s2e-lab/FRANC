    xml_data_xml = "<!ATTLIST %s XML>\n"
    # xml_data_xml.encode(encoding="utf-8", standalone=True)
    xml_data_xml = xml.etree.fromstring(xml_data_xml)
    response = app.client.post(url="/upload/xml_test.xml", data=xml_data_xml, content_type="application/xml")
    response.raise_for_status()
        
# Fixed