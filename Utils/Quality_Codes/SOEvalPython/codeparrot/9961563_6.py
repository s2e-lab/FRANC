import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    width, height = pygame.display.get_window_size()
    pygame.mouse.set_visible(False)
    surface = pygame.display.set_mode(pygame.RESIZABLE)

    left_x, left_y = 0, -5

    while 1:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()

        # draw the sprite onto the screen
        left_x, left_y = left_x + x_padding, height - 15 if left_y == 0 else height -