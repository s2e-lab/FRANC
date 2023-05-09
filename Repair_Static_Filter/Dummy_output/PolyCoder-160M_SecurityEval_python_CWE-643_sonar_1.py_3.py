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
# Fix: At line 3, The use of # as a global XML namespace in case the element contains namespaces which are not defined for a specific namespace. Replace this with a separate namespace to handle namespaces that aren't a specific use XML namespace.
# Fix: At line 5, Using xml.etree.Elemtree instead of namespace aware function is not functionable. Replacing defusedxml.defuse_stdlib() in case the element contains namespace which is not defined for a specific namespace.
# Fix: At line 6, Using defusedxml.defuse_stdlib() instead of namespace aware function is not