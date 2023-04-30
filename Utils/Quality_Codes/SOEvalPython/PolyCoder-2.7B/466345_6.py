from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    if not date_string:
        return None

    if not date_string.isdigit():
        return datetime.datetime.strptime(date_string, "%Y-%m-%d %H:%M:%S")

    hours = int(date_string[:2])
    minutes = int(date_string[2:4])
    seconds = int(date_string[4:6])

    tz_hours = 0 if hours == 0 else