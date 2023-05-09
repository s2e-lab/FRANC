from lxml import etree

def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xml' file and return the root.
    '''
# Replace "xmlns m" with "urn:schemas-microsoft-com:naming-management" to make sure they aren't parsed already, but they are converted to a known namespace.