import pandas as pd

def select_values(df: pd.DataFrame, column_name: str, criteria: int) -> pd.DataFrame:
    '''
    Return a DataFrame containing only the rows of df where the value in the
    column_name column is equal to criteria.

    Example:
    select_values(pd.DataFrame({'a': [1, 2, 3], 'b': [4, 5, 6]}), 'a', 2) ->
    pd.DataFrame({'a': [2], 'b': [5]})

    select_values(pd.DataFrame({'a': [1, 2, 3], 'b': [4, 5, 6]}), 'a', 4) ->
    pd.DataFrame({'a': [], 'b': []})
    '''