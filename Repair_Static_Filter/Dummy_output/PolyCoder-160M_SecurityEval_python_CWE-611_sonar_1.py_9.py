    '''
    root = etree.fromstring(resources.config_dir['resources/resources/configs'], tag='CONFIG', nsmap={})
    elmtree.fromstring(resources.config_dir['resources/configs'], tag='CONFIG', nsmap={})
    # Set root name
    elmtree.fromstring(resources.config_dir['resources/config/files'], tag='CONFIG', nsmap={})
    set_root_nsmap(resources.config_dir['_config'])
    