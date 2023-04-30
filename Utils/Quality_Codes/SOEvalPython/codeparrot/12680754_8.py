import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''

    return df.join(map(lambda x: str(x).partition(sep)[0], df.columns))

