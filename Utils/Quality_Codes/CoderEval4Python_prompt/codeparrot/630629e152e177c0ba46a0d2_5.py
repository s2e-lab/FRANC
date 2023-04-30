def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
	
	return_msg = ""
	handle.write("<a target='DiasporaWebfinger'>")
	handle.write("<span class='diaspora'>\n")
	handle.write("<span class='diaspora-local-diaspora'>\n")
	handle.write("<span class='diaspora-remote'>\n")
	handle.write("</span>\n")
	handle.write("<span class='diaspora-local'>\n")
	handle.write('<span class='diaspora-