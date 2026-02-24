#faça um programa em python que abra e reproduza o audio de um arquivo mp3

import pygame
import time

pygame.init()
pygame.mixer.music.load('Alan Walker - Fade.mp3')
pygame.mixer.music.play()
# pygame.event.wait()

while pygame.mixer.music.get_busy():
    time.sleep(1)