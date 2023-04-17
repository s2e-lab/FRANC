import pandas as pd

def convert_rows_to_columns(df: pd.DataFrame) -> pd.DataFrame:
    '''
    Convert rows to columns of a dataframe.

    Example:
    convert_rows_to_columns(pd.DataFrame({'a': [1, 2, 3], 'b': [4, 5, 6]})) -> pd.DataFrame({'0': [1, 2, 3], '1': [4, 5, 6]})
    '''