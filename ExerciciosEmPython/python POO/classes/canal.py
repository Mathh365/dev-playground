class Canal:
    def __init__(self, nome, inscritos, descricao, dono, editor):
        self.nome = nome
        self.inscritos = inscritos
        self.descricao = descricao
        self.editor = editor
        self.dono = dono
        self.playLists = []

    def inscrever(self):
        self.inscritos += 1
        print(f"Numero de inscritos atualizado com sucesso: {self.inscritos}.")
        
    def addPlaylist(self, playlist):
        self.playLists.append(playlist)
        
    def getPlaylists(self):
        print(self.playLists)
        
    @property
    def info(self):
        print(f"""
        Nome do canal: {self.nome}
        Dono: {self.dono}
        Editor: {self.editor}
        Inscritos: {self.inscritos}
        Descrição: {self.descricao}
        PlayLists: {self.playLists}
        """)


#-----------------------------------------------------------------------------


class video:
    def __init__(self, nome, descricao, dia, mes, ano):
        self.nome = nome
        self.descricao = descricao
        self.data = f"{dia}/{mes}/{ano}"
        self.views = 0
        self.likes = 0
        self.deslikes = 0
        self.comentarios = []
        
    def info(self):
        return f"""INFORMAÇOES DO VIDEO:
        Nome: {self.nome}
        Descrição: {self.descricao}
        Data de postagem: {self.data}
        Visualizações: {self.views}
        Likes: {self.likes}
        Deslikes: {self.deslikes}
        Comentarios: {self.comentarios}"""

    def __repr__(self):
        return f"<{self.nome}>"

    def assistir(self):
        self.views += 1

    def darLike(self):
        self.likes += 1

    def darDeslike(self):
        self.deslikes += 1

    def comentar(self, comentario):
        self.comentarios.append(comentario)
        
        
#----------------------------------------------------------------------
        
        
class PlayList:
    def __init__(self, titulo):
        self.titulo = titulo
        self.videos: list[video] = []
    @property
    def numeroDeVideos(self):
        return len(self.videos)
        
                
    def __repr__(self):
        return f"<PlayList: {self.titulo}>"
        
    def addVideo(self, video):
        self.videos.append(video)
        
    def removerVideo(self, video):
        self.videos.remove(video)

    def info(self):
        for video in self.videos:
            print(video.info() + "\n")
    