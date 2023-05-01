from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

    # Setup parser
    parser = etree.XMLParser(remove_blank_text=True)

    # Add the required XML files to the parser
    def addRequiredXmlFile(files_to_check):
        # Add each file to the etree
        for fileToCheck in files_to_check:
            full_path = os.path.join(os.path.dirname(os.path.realpath(__file__)), fileToCheck)
            fileToSaveTo = open(full_path, "w")
            tree = etree.parse(full_path)
            filename = "data/c.xml"