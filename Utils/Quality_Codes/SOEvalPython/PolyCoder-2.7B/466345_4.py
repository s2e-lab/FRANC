from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    date_to_convert = datetime.strptime(date_string, '%Y-%m-%d').replace(tzinfo=timezone.utc)
    return date_to_convert

