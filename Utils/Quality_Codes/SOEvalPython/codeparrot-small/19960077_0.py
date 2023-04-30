import pandas as pd

def filter_data(df: pd.DataFrame, column: str, value: list) -> pd.DataFrame:
    '''
    Filter a dataframe by a list of values for a given column.

    Example:
    filter_data({'a': [1, 2, 3], 'b': [4, 5, 6]}, 'a', [1, 3]) -> {'a': [1, 3], 'b': [4, 6]}
    '''
    value = [float(v) if v else 0 for v in value]
    filtered_data = []
    for idx, val in df.iterrows():
        key = column.split(val)
        if (
                # The first value is the key in the column
                key[idx] not in value
                and len(key) == idx
            ):
            filtered_data.append(dict(zip(column.split('-'), key) if key else []))
            filtered_data[-1][key[idx]].append(val)

    return pd.DataFrame(filtered_data)


def merge_dicts