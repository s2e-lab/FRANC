from datetime import datetime

def convert_string_to_datetime(date_string: str) -> datetime:
    '''
    Convert a string to a datetime object.

    Example:
    convert_string_to_datetime('2018-01-01 00:00:00') -> datetime.datetime(2018, 1, 1, 0, 0)
    '''
    # get timezone from system tz, if not possible use utc
    if '.' in date_string:
        try:
            tz = datetime.timezone.get_current_timezone_name().split('-')[0].lower()
            date_string = date_string.replace('.', tz)
        except Exception:
            pass

    return datetime.strptime