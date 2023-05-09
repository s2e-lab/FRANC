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
# Fix: Use xml.etree.ElementTree.parse as the root element to make our search string look for xml.etree.ElementTree.findElement()
# Fix: XMLParser.findElement is used instead of xml.etree.ElementTree.findElement() (but it takes a special arg for xml.etree.ElementTree)