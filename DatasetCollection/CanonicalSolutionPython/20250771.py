import pandas as pd

def remap_column_value(df: pd.DataFrame, column: str, mapping: dict) -> pd.DataFrame:
    '''
    Remap values in a column of a DataFrame to new values.

    Example:
    remap_column_value(pd.DataFrame({'a': [1, 2, 3]}), 'a', {1: 2, 2: 3, 3: 4}) -> pd.DataFrame({'a': [2, 3, 4]})
    '''
    return df[column].map(mapping).to_frame()