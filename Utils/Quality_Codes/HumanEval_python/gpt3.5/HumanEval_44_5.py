

def change_base(x: int, base: int) -> str:
    result = ""
    while x > 0:
        remainder = x % base
        result = str(remainder) + result
        x //= base
    return result