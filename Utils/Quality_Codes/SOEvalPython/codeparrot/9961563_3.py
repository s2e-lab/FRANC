import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    global mouse_pos
    if mouse_pos[0] > 0:
        mouse_pos = (mouse_pos[0], mouse_pos[1] - 10)

