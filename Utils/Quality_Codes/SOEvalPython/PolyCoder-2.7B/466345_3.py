from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    date_string_l = date_string.split(' ')[0]
    try:
        return datetime.strptime(date_string_l, '%d-%m-%y %H:%M:%S')
    except AttributeError:
        pass
    return datetime.strptime(date_string_l, '%d-%m-%y')


