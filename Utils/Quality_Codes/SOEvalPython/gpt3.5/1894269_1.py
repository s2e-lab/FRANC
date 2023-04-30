Here's the code for the str_to_list function:

```
import ast

def str_to_list(list_string: str) -> list:
    return ast.literal_eval(list_string)
```
