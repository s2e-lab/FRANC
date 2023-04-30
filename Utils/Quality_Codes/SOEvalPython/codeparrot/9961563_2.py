import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    x_pos = pygame.mouse.get_pos()
    y_pos = pygame.mouse.get_pos()
    x_delta = x_pos - x_pos % 2
    y_delta = y_pos - y_pos % 2
    sprite.x += x_delta
    sprite.y += y_delta


