import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    # Saves screenshot of the bubbles.
    screen.blit(main_img["img_1"], (0, 0))
    screen.blit(main_img["img_2"], (0, SCREEN_WIDTH))

    # Draws the new bubble.
    main_img["frame"] = main_img["img_1"]
    pygame.draw.circle(screen, main_img["img_1"], (int(SCREEN_WIDTH/2)-90, int(SCREEN_HEIGHT/2)), int(50))

    # Updates the screen.
    pygame.display.flip