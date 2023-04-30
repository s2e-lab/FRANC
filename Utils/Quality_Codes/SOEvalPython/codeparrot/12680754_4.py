import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    assert is_list_like(df.columns), "columns should be a list, not a %s" % type(df.columns)

    if not isinstance(col, list):
       raise Exception("columns should be a list, not a %s" % type(col))

    if not all(isinstance(x, str) for x in col):
        raise Exception("columns should be str, not a %s" % type(col))

    if not all(dtype in df.columns for dtype in [str, unicode]):
        raise Exception("columns should be str, not a %s" %