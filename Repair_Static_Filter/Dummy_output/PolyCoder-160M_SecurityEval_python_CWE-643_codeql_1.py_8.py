    
    xpath = etree.parse(request.POST)

    xpath['xpath'] = [tag.xpath(node='//a/span/text()').get()]

# Fix: At line 1, Using _eval() instead of eval()

# Fixed Code: 

# Fix: The "id" property is used internally only for XPath query requests.
#     Some XSLD methods will be used in future XSLD calls.
#     The XPath Query APIs to use that method should NOT implement "id",