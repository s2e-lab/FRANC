import pandas as pd

def iterate_row(df: pd.DataFrame):
    '''
    Iterate over rows of a DataFrame and print the row index and the row content.
    '''
    for index, row in df.iterrows():
        print(index, row)