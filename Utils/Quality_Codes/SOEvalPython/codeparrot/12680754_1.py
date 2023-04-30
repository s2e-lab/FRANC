import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    def split_indices(row):
        return list(set(e for e in row.split(sep)
                       if e!= ''))
    if len(df.columns) == 1:
        return pd.get_dummies(split_indices(df.columns[0]))[0]
    else:
        return pd.get_dummies(list(set(df[col].split(sep) for col in df.columns)))[0]

