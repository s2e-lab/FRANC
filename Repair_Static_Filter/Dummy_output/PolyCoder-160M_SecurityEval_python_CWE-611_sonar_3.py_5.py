    import logging
    '''
    import logging
    logging.getLogger(
       'resources').addHandler(
            logging.BASIC_FORMAT, log_handler=logging.FileHandler)
    '''
    print(log_handler.format_log())
    for line in log_handler.logLines(root_node):
        attributes[line.rstrip()] = line.strip()
    for line