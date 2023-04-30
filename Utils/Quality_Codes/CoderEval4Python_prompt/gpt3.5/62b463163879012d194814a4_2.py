import os
import zipfile
import xml.etree.ElementTree as ET

def _explore_zipfile(zip_path):
    with zipfile.ZipFile(zip_path, "r") as f:
        files_list = f.namelist()
        xml_files = [file for file in files_list if file.endswith('.xml')]
        
        data_dict = {}
        for xml_file in xml_files:
            xml_basename = os.path.splitext(os.path.basename(xml_file))[0]
            xml_data = f.read(xml_file)
            
            try:
                xml_root = ET.fromstring(xml_data)
                data_dict[xml_basename] = xml_root
            except ET.ParseError as e:
                print("Could not parse {}: {}".format(xml_file, e))
    
    return data_dict