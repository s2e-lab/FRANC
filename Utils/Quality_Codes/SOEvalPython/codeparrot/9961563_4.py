import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    current_x = s.rect.centerx
    current_y = s.rect.centery
    s.background = s.images['b_background']
    s.screenrect = pygame.Rect(s.rect.x, s.rect.y, s.rect.width, s.rect.height)
    s.clock = pygame.time.Clock()
    s.rect.x, s.rect.y = current_x, current_y
    s.images["b_background"] = s.clock.get_rect().move(s.speed[0] * s