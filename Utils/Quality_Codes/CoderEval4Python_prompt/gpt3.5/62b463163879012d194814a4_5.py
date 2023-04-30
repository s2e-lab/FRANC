import zipfile
import os

def _explore_zipfile(zip_path):
    # Create dictionary to store packages' data
    package_data = {}
    with zipfile.ZipFile(zip_path, 'r') as zip:
        # Iterate through all files in the zip
        for file in zip.namelist():
            # Check if file is XML
            if file.endswith('.xml'):
                # Get XML basename
                base_name = os.path.basename(file).split('.')[0]
                # Add package data to dictionary
                if base_name in package_data:
                    package_data[base_name].append(zip.read(file))
                else:
                    package_data[base_name] = [zip.read(file)]
    return package_data