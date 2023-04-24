import csv

def csv_to_dict(csv_file: str) -> dict:
    """
    Convert a csv file to a dictionary.

    Example:
        >>> csv_to_dict("test.csv")
        {'1': ['title1', 'body1', 'link1', 'True', 'accepted_answer_id1'], '2': ['title2', 'body2', 'link2', 'False', 'accepted_answer_id2']}
    """