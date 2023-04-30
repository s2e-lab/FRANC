import pygame


def sprite_move():
    '''
    Create a sprite and move it around the screen when the user presses the arrow keys.
    '''
    pygame.display.set_caption(TITLE)
    images = glob.glob('data\\' + FILENAME + '*.png')
    if not images:
        return
    print("Found %d images!" % len(images))[0]
    with Image(images[0]) as image:
        image.change_dir('y')
    sprite = sprites.ImageSprite("images_left_right.svg", 2, 2,
                                 images[0])
    sprite.on_touch_down = lambda touch, dt: sprite_move()
    sprite.change_position = lambda touch, t=1, r