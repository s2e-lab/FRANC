def str_to_list(list_string: str) -> list:
    # Remove any whitespaces from the string representation
    list_string = list_string.replace(' ', '')
    
    # Check if the string representation starts and ends with square brackets
    if list_string[0] == '[' and list_string[-1] == ']':
        # Remove the square brackets
        list_string = list_string[1:-1]
        # Split the string by commas to get each element
        element_list = list_string.split(',')
        # Convert each element to the appropriate data type (int or float)
        element_list = [eval(element) for element in element_list] 
        return element_list
    else:
        raise ValueError('Invalid string representation of a list')