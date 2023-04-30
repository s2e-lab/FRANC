from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    try:
        if date_string.startswith('-') or date_string.startswith('+'):
            sign = date_string[1:].strip('-')
        else:
            sign = 1
        day = int(date_string[0:2])
        month = int(date_string[2:4])
       