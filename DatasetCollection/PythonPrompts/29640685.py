import pygame
pygame.init()
window = pygame.display.set_mode((250, 250))
rect = pygame.Rect(*window.get_rect().center, 0, 0).inflate(100, 100)

#Define the sprite class
class Sprite:
    def __init__(self, x, y, name):
        self.image = pygame.image.load(name)
        self.rect = self.image.get_rect(topleft = (x, y))

    def render(self):
        window.blit(self.image, self.rect)

# Define the bullet class to create bullets          
class Bullet:
    def __init__(self, x, y):
        self.bullet = pygame.image.load("user_bullet.BMP")
        self.rect = self.bullet.get_rect(topleft = (x + 23, y))

    def render(self):
        window.blit(self.bullet, self.rect)


def detect_collision(sprite, bullet):
    '''
    Returns True if the sprite and bullet collide and False otherwise.
    '''