Here's the code for the `str_to_list` function:

```
def str_to_list(list_string: str) -> list:
    # remove brackets and white spaces from string and split by comma 
    list_string = list_string.strip('[]').replace(' ', '')
    split_string = list_string.split(',')
    # convert string to a list of integers or floats
    converted_list = []
    for element in split_string:
        # check if element is an integer or a float
        try:
            converted_list.append(int(element))
        except ValueError:
            try:
                converted_list.append(float(element))
            except:
                raise ValueError('Invalid input string')
    return converted_list
```
