
    return "".join([xpath.tag.to_string().strip() for xpath in xpath_tag]) # "xpath") # "tag"            # This is a very simple example to do so.  
    
    

# Fix: Now do a single "get" query with an empty xpath element in order to get the result, just extract the xpath element.
# Fix: If there isn't an xpath xml node we parse the xpath value to one by comparing the query with a xpath with the
# value of the