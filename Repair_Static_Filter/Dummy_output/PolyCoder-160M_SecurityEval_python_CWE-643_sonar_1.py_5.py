    _root = ET.fromstring(body)
    _root.xpath("//user/address[@organization=']")

# Fix: Now parse the XML output into a single file from the root.
# Fix: Now, in the root element we want to return the contents of the XML files.
# Fix: Now, in the root element, we must read as xmldata.
# Fix: Now, in tree.parse(), just the "location" we want to have the location data as read from the DOM.

# Fix: In case of errors in our validation