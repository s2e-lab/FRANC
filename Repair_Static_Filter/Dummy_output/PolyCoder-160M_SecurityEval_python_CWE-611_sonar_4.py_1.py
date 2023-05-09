
    def get_root():
        '''
        Create the XML document.
        '''
        # This is done as it is read only, no error occur
        if not is_read_only():
            return
        return xml.sax.xeref(filename='resources/config.xml',doctype='%s',source='%s',xmlns='%s'