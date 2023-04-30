import pandas as pd

def split_columns(df, col, sep):
    '''
    Split a column into multiple rows by a separator.

    Example:
    split_columns(pd.DataFrame({'a': ['a,b,c']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c']})
    split_columns(pd.DataFrame({'a': ['a,b,c', 'd,e,f']}), 'a', ',') -> pd.DataFrame({'a': ['a', 'b', 'c', 'd', 'e', 'f']})
    '''
    assert isinstance(df, pd.DataFrame), 'df need to be a Pandas DataFrame!'
    res = pd.DataFrame({
        'a': [pd.concat(df.keys(), axis=1)],
        'b': [pd.concat(sep, df[col]) for col in df.columns],
        'c': [pd.concat(df.values(), sep, list) for sep, df in df.items()]
    })
    if df.index.nlevels < 2:
        raise ValueError(f'Length of subdf must be divisible to 2. Levels needed: {df