from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    import re
    m = re.search('\d{1,2}-\d{1,2}-\d{4}$', date_string)
    if m is None: return datetime.datetime.fromtimestamp(0)
    return datetime.datetime(year=int(m.group(0)), month=int(m.group(0)) - 1, day=int(m.group(0)) - 1, hour=int(m.group(0)), minute=int(m.group(0)) - 1, second=int(