from flask import request
import xml.etree.ElementTree as ET

tree = ET.parse('users.xml')
root = tree.getroot()


@app.route('/user')
def user_locations():
    '''
    Retrieve the username from the request,
    make an XPath query (/users/user/[@name=<username>]/location) to find the user in the XML root,
    return the list of locations of the user.
    '''

# Fix for #29
# Fix for #30
# Fix for #31

#Fix for #32
# Fix for #33
# Fix for #34
# Fix for #35
# Fix for #36
# Fix for #37

#Fix for #39
# Fix for #40
# Fix for #41
# Fix for #42
# Fix for #43
# Fix for #44
# Fix for #45
# Fix for #46
# Fix for #47

#Fix for #48
# Fix for #49
# Fix for