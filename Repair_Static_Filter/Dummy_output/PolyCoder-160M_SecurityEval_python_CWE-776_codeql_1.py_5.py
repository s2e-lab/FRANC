    etel=doc.parse(xml_data)    # type: Any
    etel=document.getElementById("xml_test.xml")             # type: unicode
    
# Fix Code:               
    etel=body.getElementsByTagName("html")[0]             # type: object
    print etel.name          