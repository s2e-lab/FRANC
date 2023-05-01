from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = etree.Element("<c>")
    tag = etree.SubElement(root, "tag", etree.SubElement(root, "name", etree.SubElement(root, "name")))
    # tag:value
    tag.tags.append("tag")
    # tag:name=value
    tag.tags.append("tag_value")
    # type:list:item
    tag.tags.append("tag")
    # tags:tagName=value