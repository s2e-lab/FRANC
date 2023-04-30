import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''    
    if col is None:
        return df
    if is_dataframe(col):
        cols = [ c.strip() for c in col.split(sep) ]        
        for col in cols:
            col_split = split_column(df, col.split(sep), sep)
            cols.append('--'.join([col_split[0], col_split[1]]))
    else:
        cols = split_columns(df, col.split(sep))
        for col in cols:
            col_split = split_column(df, col.split(sep), sep)
            cols.append(