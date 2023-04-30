import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    if not isinstance(df, pd.DataFrame):
        raise TypeError('df must be a pandas DataFrame')

    if col in df.columns:
        if isinstance(col, str):
            t = pd.Series(pd.Categorical(col))
        elif hasattr(df, col):
            t = df[col]
        else:
            try:
                t = df.split(sep)
            except ValueError:
                raise ValueError("could not parse column %s" % col)
    else:
        raise ValueError('column %s not in df' % col)

    return t

