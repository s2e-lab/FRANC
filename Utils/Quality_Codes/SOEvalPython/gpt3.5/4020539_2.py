Here's the implementation for "process_escape_sequence" function:

```
def process_escape_sequence(string: str) -> str:
    # replace \n with actual newline character
    string = string.replace("\\n", "\n")
    
    # replace \t with actual tab character
    string = string.replace("\\t", "\t")
    
    # return processed string
    return string
```
