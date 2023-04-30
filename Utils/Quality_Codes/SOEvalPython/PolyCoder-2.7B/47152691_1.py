import pandas as pd

def pivot_dataframe(df: pd.DataFrame) -> pd.DataFrame:
    """
    Pivot the dataframe so that the column names are the values of the column 'name'
    and the values are the values of the column 'value'.

    Example:
    pivot_dataframe(pd.DataFrame({'id': [1, 2, 3], 'name': ['a', 'b', 'c'], 'value': [1, 2, 3]}))
    -> pd.DataFrame({'a': [1, np.nan, np.nan], 'b': [np.nan, 2, np.nan], 'c': [np.nan, np.nan, 3]})
    """
    row = df.pivot(index=['value'], columns=['name'], values='value').to_dict()
    columns = row.columns
    values = row['value']
    assert columns[0] == 'value'
    assert len(values) == len(values)
    assert columns[1] == 'name'
    assert len(values) == len(values)
    assert columns[-1] == 'id'
    return df

