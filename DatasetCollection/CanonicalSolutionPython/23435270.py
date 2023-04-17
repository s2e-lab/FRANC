import re
def extract_number_from_string(string)->list:
    '''
    Extracts all numbers from a string and returns them as a list.
    
    Example:
    extract_number_from_string('abc123def456ghi') -> [123, 456]
    extract_number_from_string('abc123def456ghi789') -> [123, 456, 789]
    '''
    return [int(s) for s in re.findall(r'\d+', string)]