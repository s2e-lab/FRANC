
    def xpathxpath(node):
        if not isinstance(node, StringIO):
            return
        xpath = ''
        while "item" not in node.tag:
            xpath += node.tag.split("item")
            node = node[1:]
        node = StringIO.StringIO(xpath)