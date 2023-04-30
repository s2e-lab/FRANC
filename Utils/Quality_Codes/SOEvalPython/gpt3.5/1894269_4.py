def str_to_list(list_string: str) -> list:
    list_string = list_string.replace("[", "").replace("]", "").replace(" ", "")
    list_array = list_string.split(",")
    return [int(x) for x in list_array]