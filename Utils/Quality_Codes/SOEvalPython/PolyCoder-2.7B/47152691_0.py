import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """
    pivot_table = pivot_table(df, 'name', ascending=False)
    table = pivot_table  # use the name of the original table

    # convert the values to the original data and reindex
    index = {'type': 'value_type',
             'id': 'test-id',
             'name': 'test-name'}
    name_index = index['name*']
   