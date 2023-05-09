
from app import config
from app.db import db_connection
from app.logging import get_logger

        # The XML to load
        xml_resource = db_connection.get_resource("xml")
        xml_content_string = xml_resource.get("content_string")

        # Read the XML.
        result = xml_content_string.read()
        assert "<?xml version