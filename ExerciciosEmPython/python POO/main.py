import classes.canal as canal

#INSTANCIAS
meuCanal = canal.Canal("MIr4aii Codings", 200, "Bora codar?", "Matheus", "Gabriel")
playlist1 = canal.PlayList("MinhaPrimeiraPlayList")
playlist2 = canal.PlayList("playlist de teste")

#VIDEOS
mineDosCria = canal.video("Zerando mine em 1 dia???", "eu e meus amigos zeramos mine em 1 dia", 15, 1, 2001)
foca = canal.video("Banheira de nutella", "entrei numa banheira de nutella, e veja no que deu", 10, 12, 2001)
introducao = canal.video("Bora aprender POO?", "ensinando POO de forma pratica", 11, 12, 2001)

playlist1.addVideo(foca)
playlist1.addVideo(introducao)
meuCanal.addPlaylist(playlist1)
meuCanal.addPlaylist(playlist2)

foca.assistir()
foca.comentar("Nao gostei deste video")
foca.darDeslike()

introducao.darLike()
introducao.assistir()
introducao.comentar("Esse sim, conteudo de qualidade")
meuCanal.inscrever()

print(playlist1.info())