    print("""<config.xml>""")
    for tag in etype.gettags('config.xml'):
        if not tag.tagpresent('resources'):
            print("''<resource config.xml>'''")
            continue

        name = tag.tagname
        value = etree.fromstring(tag.tagvalue, ET_NAMESPACE)
    