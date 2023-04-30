import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    surf = pygame.display.get_surface()
    draw = ImageDraw.Draw(surf)
    rect = display_rect(surf)
    rect.x += 10
    rect.y += 10
    draw.ellipse(draw.center, (0,0,255),fill = 'white')
    draw.ellipse(((0,0),(0,0)))
    print(bcolors.WHITE, end='')
    show_message(surf, "Click the arrow keys button for more info.", "Click the arrow keys", 0.3)


