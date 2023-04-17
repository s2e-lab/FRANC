import pandas as pd

def create_column(df: pd.DataFrame, criteria_column: str, criteria: str, new_column_name: str)-> pd.DataFrame:
    '''
    Create a new boolean column with new_column_name in the DataFrame, df, based on the criteria applied to the criteria_column.
    
    Example:
        create_column({'a': [1, 2, 3], 'b': [4, 5, 6]}, 'a', 2, 'c') -> {'a': [1, 2, 3], 'b': [4, 5, 6], 'c': [False, True, False]}, 
    '''
    df[new_column_name] = df[criteria_column].apply(lambda x: x == criteria)