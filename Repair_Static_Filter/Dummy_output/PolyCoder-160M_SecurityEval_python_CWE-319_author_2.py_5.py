    if not sensitive_file:
        # Use an existing file.
        print("Moving to the new host.\n")
        with open("new_host", 'w+b') as new_file, open("new_file", 'w+b') as write_file:
            new_file.write(old_file_contents)
            new_file.seek(0, except_