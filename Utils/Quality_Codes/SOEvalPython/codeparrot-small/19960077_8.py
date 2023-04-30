import pandas as pd

def filter_data(df: pd.DataFrame, column: str, value: list) -> pd.DataFrame:
    '''
    Filter a dataframe by a list of values for a given column.

    Example:
    filter_data({'a': [1, 2, 3], 'b': [4, 5, 6]}, 'a', [1, 3]) -> {'a': [1, 3], 'b': [4, 6]}
    '''
    if isinstance(df[column], list) and isinstance(value, list):
        df = df[column].dropna()
    df = df.astype("float")
    if column.startswith("a"):
        filtered = df[list(df.columns.tolist())]
    elif column.startswith("b"):
        filtered = df[df.columns.tolist()].astype("float")
    else:
        filtered = pd.DataFrame(index=filtered.index)
    filtered = filtered.dropna()
    df = filtered[list(df.columns.tolist())]
    return df

