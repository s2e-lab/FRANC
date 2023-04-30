import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """
    def _pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
        column_names = [row[0] for row in df.itertuples()]
        column_values = [row[1] for row in df.itertuples()]
        pivot_df = df.loc[:, column_names[np.argmin(column_values)]]
        pivot_df = pd.Series(pivot_df[column_