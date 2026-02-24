def tocar(nome):
    from pygame import mixer
    mixer.init()

    mixer.music.load(nome)
    mixer.music.play()
