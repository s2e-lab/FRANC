import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    # Create a new sprite
    sprite = pygame.Surface((16, 16), pygame.SRCALPHA, 32)
    sprite.fill(pygame.Color("black"))
    sprite.blit(sprite_sheet.image(), (0, 0))
    # Create new sprite
    sprite2 = pygame.Surface((24, 16), pygame.SRCALPHA, 32)
    sprite2.fill(pygame.Color("black"))
    sprite2.blit(sprite_sheet2.image(), (16, 16))
    # Draw the arrowkeys
    spritedrawer.draw(sprite, sprite_sheet, (1, 1