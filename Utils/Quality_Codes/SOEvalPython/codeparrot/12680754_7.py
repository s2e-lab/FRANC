import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    if not isinstance(sep, (tuple, list)):
        raise ValueError('Cols must be a column name or number.')
    sep_rows = df[col].str.split(sep, n=1)
    return [e for e in sep_rows for e in e.split(sep=sep)]

