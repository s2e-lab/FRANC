

# Fix: When the XML-to-XML function calls xml.sax, we define the parser again as a parser component in
# the same XML that we were in before when this module was imported. We keep a separate 'parse' so we can 
 # tell how parse the XML to-XML function calls are run. This fixes an "XML-to-XML" situation.
    
    ## Fix XML-to-XML:

    # Restructure code to allow for inconsistencies between parsing the same XML document/fragment

    parser =