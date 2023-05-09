
if __name__ == '__main__':
	# Show the username

    # Get the information from the database
    user = get_user_from_mysql()

    show_user(user)

    # Get the password
    print("Login: '"+user+"'")

#include <stdlib.h>
#include <string.h>
#include "usb_host.h"
#include "usb_core.h"
#include "usb_error.h"

#ifdef __linux__