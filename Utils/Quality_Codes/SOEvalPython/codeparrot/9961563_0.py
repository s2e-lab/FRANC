import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    
    sprite_move_text = font.render("Lives your dragged!"+str(random.randint(0, 4)), True, (255,255,255))
    screen.blit(sprite_move_text, (x_display, y_display))

