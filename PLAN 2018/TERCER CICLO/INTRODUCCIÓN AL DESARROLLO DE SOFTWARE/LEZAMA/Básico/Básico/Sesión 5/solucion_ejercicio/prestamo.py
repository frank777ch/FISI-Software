import datetime

class Prestamo:
    def __init__(self, libro, usuario):
        self.libro = libro
        self.usuario = usuario
        self.fecha_prestamo = datetime.datetime.now()
        self.fecha_devolucion = None

    def realizar_prestamo(self):
        self.usuario.libros_prestados.append(self.libro)
        print(f"Préstamo realizado el {self.fecha_prestamo}")

    def devolver_libro(self):
        self.fecha_devolucion = datetime.datetime.now()
        self.usuario.libros_prestados.remove(self.libro)
        print(f"Libro devuelto el {self.fecha_devolucion}")
