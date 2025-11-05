class Canal:
    def __init__(self, nome, inscritos, descricao, dono, editor):
        self.nome = nome
        self.inscritos = inscritos
        self.descricao = descricao
        self.editor = editor
        self.dono = dono
        self._playLists: list[PlayList] = []
    @property
    def info(self):
        print(f"""
        Nome do canal: {self.nome}
        Dono: {self.dono}
        Editor: {self.editor}
        Inscritos: {self.inscritos}
        Descrição: {self.descricao}
        PlayLists: {self._playLists}
        """)

    def inscrever(self):
        self.inscritos += 1
        print(f"Numero de inscritos atualizado com sucesso: {self.inscritos}.")
        
    def addPlaylist(self, playlist):
        if playlist not in self._playLists:
            self._playLists.append(playlist)
            print(f"Playlist {playlist} adicionada com sucesso!!")
        else:
            print("Esta playlist ja faz parte do canal")
            
    def removePlaylist(self, playlist):
        if playlist in self._playLists:
            self._playLists.remove(playlist)
            print(f"Playlist '{playlist}' removida com sucesso.")
        else:
            print("Esta playlist nao existe no canal")
        
    def getPlaylists(self):
        print(f"ESTAS SÃO AS PLAYLISTS CONTIDAS NO CANAL '{self.nome}'\n")
        for i in  self._playLists:
            print(i)
            i.inform


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
        self._videos: list[video] = []
    @property
    def numeroDeVideos(self):
        return len(self._videos)
    @property
    def inform(self):
        for _video in self._videos:
            print(_video.info() + "\n")
        
                
    def __repr__(self):
        return f"<PlayList: {self.titulo}>"
        
    def addVideo(self, video):
        if video not in self._videos:
            self._videos.append(video)
            print(f"_Video '{video}' adicionado com sucesso a playlist {self.titulo} !!")
        else:
            print("Este video ja esta na playlist")
        
    def removerVideo(self, video):
        if video in self._videos:
            self._videos.remove(video)
            print(f"Video '{video}' removido com sucesso da playlist {self.titulo} !!")
        else:
            print("Este video nao existe nesta playlist")