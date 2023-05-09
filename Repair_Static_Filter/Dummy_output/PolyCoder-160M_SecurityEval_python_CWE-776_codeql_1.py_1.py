
'''

    user: None

    # Create data for user.
    with app.test_client() as cli:
        user = cli.post("/user", text=user_input,                          # type: unicode
                        headers={"User-Agent": "google-python-chrome"},    # type