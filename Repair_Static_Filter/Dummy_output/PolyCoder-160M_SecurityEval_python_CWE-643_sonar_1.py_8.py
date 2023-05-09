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
# 1. Define Node Tree, a node tree with the following functionality:
#
# Node Tree: Get all node information and data from nodes in XML representation


# 2. Define a function that extracts xml.etree.ElementTree objects from XML tree
#
# a. Extract each element from XML representation of the node at URL path:
#
# a. Get its XML Node Tree object from given path, extracting the data from
#    the XML node tree
