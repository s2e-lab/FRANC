import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    screen.fill(BGCOLOR)
    # screen.fill(BGCOLOR)
    position = 0
    pygame.draw.rect(screen, GREEN, BGCOLOR1, BGCOLOR2)
    pygame.draw.rect(screen, RED, GREEN,  BGCOLOR3)
    position += 300
    screen.blit(BGCOLOR, (position, 200))


