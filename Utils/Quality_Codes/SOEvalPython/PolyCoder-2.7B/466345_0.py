from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    if not date_string:
        return

    # If the string is a date without time zone, there's nothing to convert.
    if date_string.startswith('00:00:00') \
       or date_string.isdigit():
        return datetime(int(time.mktime(struct.pack(date_string[2:][1:],
                       