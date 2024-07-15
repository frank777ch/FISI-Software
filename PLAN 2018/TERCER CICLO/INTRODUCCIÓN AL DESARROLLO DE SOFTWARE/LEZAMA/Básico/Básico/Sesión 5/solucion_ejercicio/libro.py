class Libro:
    def __init__(self, titulo, autor, ano_publicacion):
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacion = ano_publicacion

    def mostrar_info(self):
        print("Título:", self.titulo)
        print("Autor:", self.autor)
        print("Año de Publicación:", self.ano_publicacion)
