    def can_use_xml():
        
        if 'host' in root.getrootnodes().children[0]:
            
            return True
        else:
            
            print('Could not find host to which this data was requested. Check the host_url and try again.')


# Fixed