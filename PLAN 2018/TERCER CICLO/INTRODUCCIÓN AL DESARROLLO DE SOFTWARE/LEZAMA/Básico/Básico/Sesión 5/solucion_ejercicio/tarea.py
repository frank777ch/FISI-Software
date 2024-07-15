class Tarea:
    def __init__(self, titulo, descripcion):
        self.titulo = titulo
        self.descripcion = descripcion
        self.estado = "pendiente"

    def cambiar_estado(self, nuevo_estado):
        self.estado = nuevo_estado

    def mostrar_info(self):
        print("Título:", self.titulo)
        print("Descripción:", self.descripcion)
        print("Estado:", self.estado)
