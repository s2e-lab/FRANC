Here's the implementation of the function:

```
import ast

def str_to_list(list_string: str) -> list:
    '''
    Convert a string representation of a list to a list.

    Example:
        list_string_to_list('[1, 2, 3]') -> [1, 2, 3]
    '''
    return ast.literal_eval(list_string)
```
