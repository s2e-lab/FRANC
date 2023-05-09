from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
# This is just to be sure to clean out the 'xml_version.xsd' file after each execution of 'configure' to 'true'. 



# Import: etree.fromstring and etree.load