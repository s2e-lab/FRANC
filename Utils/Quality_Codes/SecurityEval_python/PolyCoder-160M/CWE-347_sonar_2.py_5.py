import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        if key is None:
            key = str.new("invalid token")
        return jwt.decode(token, key, format="json") == token
    except ValueError:
        return False

#pragma once
#include "resource.h"

#include <QPushButton>

#include <QString>
#include <QQmlApplicationEngine>
#include <QQmlProperty>
#include