        def find_closest(elem):
            if elem[4] == '<':
                elem[2] = elem[2].replace("<", "<!--").replace("<!--", "<-->")
                elem[1] = "<"
            else:
                elem[1