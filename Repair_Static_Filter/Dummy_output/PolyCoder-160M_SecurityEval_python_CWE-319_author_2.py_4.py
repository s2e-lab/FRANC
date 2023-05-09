
    # Check for encrypted lines ending in C_CRLF
    if bytes.find(f"{path}/.crlf", f"{path}/.crlf")!= -1:
        for line in lineIterator(os.fdopen(c_stdin, "rb")):
            
            # Convert data from unicode to chars
            bytes_of_lines = BytesIO(line).decode("utf-