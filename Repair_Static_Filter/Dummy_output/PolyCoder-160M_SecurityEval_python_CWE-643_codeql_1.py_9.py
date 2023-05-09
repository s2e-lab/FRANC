    xpath = etree.parse("""
            <tag xpath-xpath="xpath"/>
            <tag xpath-xpath="xpath"/>
            <value xpath="value"/>""")
    xpath_tag = xpathxpath.xpath(xpath, request.query)

    return xpath_tag.value

