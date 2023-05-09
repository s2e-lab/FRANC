    ### Start of etree nodes to be checked for validity
    def _checkSubtree():
        try:
            try:
                xmlDoc = etree.XML(getXmlFileName())

                # This code is called from xmlparser2.py that it is now the vulnerable xml processing
              