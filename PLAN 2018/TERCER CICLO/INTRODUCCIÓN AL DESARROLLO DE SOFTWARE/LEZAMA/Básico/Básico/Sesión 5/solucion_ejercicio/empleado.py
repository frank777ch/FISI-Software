class Empleado:
    def __init__(self, nombre, cargo, salario):
        self.nombre = nombre
        self.cargo = cargo
        self.salario = salario

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Cargo:", self.cargo)
        print("Salario:", self.salario)
