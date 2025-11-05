import classes.canal as canal

#INSTANCIAS
meuCanal = canal.Canal("MIr4aii Codings", 200, "Bora codar?", "Matheus", "Gabriel")
playlist1 = canal.PlayList("MinhaPrimeiraPlayList")
playlist2 = canal.PlayList("Essa é só teste")

#VIDEOS
mineDosCria = canal.video("Zerando mine em 1 dia???", "eu e meus amigos zeramos mine em 1 dia", 15, 1, 2001)
autista = canal.video("Banheira de nutella", "entrei numa banheira de nutella, igual autista", 10, 12, 2001)
introducao = canal.video("Bora aprender POO?", "ensinando POO de forma pratica", 11, 12, 2001)

playlist1.addVideo(autista)
playlist1.addVideo(introducao)

meuCanal.addPlaylist(playlist1)
meuCanal.addPlaylist(playlist2)

playlist1.info()