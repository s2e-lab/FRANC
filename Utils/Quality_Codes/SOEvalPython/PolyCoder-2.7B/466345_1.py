from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    match = re.match(r'(\d{4}-\d\d-\d\dT|\d\d:\d\d:\d\d)', date_string)
    if match is None:
        return datetime(year=int(date_string), month=1, day=1)
    else:
        return datetime(time=(int(match.group(1)), int(match.group(2)),
               