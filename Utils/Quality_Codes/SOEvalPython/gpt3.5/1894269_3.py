Here is the code to convert a string representation of a list to a list:

```python
import ast

def str_to_list(list_string: str) -> list:
    '''
    Convert a string representation of a list to a list.

    Example:
        list_string_to_list('[1, 2, 3]') -> [1, 2, 3]
    '''
    return ast.literal_eval(list_string)
```
