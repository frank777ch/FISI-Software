class Usuario:
    def __init__(self, nombre, correo_electronico):
        self.nombre = nombre
        self.correo_electronico = correo_electronico
        self.libros_prestados = []

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Correo Electrónico:", self.correo_electronico)
        print("Cantidad de Libros Prestados:", len(self.libros_prestados))
