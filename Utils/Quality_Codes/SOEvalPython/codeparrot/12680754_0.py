import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    import pandas as pd
    assert isinstance(df, pd.DataFrame)
    columns = df[col].str.split(sep)
    if len(columns) == 2 and isinstance(columns[1], basestring):
        columns = [columns]
    return columns

