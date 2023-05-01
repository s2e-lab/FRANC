import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    if not sss_enabled:
        raise RuntimeError("SSS is disabled.")
    if not SSSDb:
        raise RuntimeError("Could not load SSSDb. Check that sssda is properly configured.")
    session_id = randomStr()
    while session_id in [SSSDb.session_id_sss, SSSDb.session_id_sss_session_id_not_random_based]:
        session_id =