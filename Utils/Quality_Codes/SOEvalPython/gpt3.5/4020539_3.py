Here's one possible implementation:

```
def process_escape_sequence(string: str) -> str:
    escape_map = {'\\n': '\n', '\\t': '\t', '\\r': '\r', '\\\\': '\\'}
    result = ''
    i = 0
    while i < len(string):
        if string[i] == '\\':
            if i < len(string) - 1 and string[i+1] in escape_map:
                result += escape_map[string[i+1]]
                i += 2
            else:
                result += string[i]
                i += 1
        else:
            result += string[i]
            i += 1
    return result
```
