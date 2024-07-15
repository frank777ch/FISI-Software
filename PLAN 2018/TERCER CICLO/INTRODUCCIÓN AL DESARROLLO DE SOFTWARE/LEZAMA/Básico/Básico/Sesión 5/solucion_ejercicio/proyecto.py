class Proyecto:
    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion
        self.tareas = []

    def agregar_tarea(self, tarea):
        self.tareas.append(tarea)

    def mostrar_progreso(self):
        tareas_completadas = sum(1 for tarea in self.tareas if tarea.estado == "completada")
        total_tareas = len(self.tareas)
        progreso = (tareas_completadas / total_tareas) * 100
        print(f"Progreso del proyecto '{self.nombre}': {progreso}%")
        
    def calcular_costo(self):
        costo_total = sum(empleado.salario for tarea in self.tareas for empleado in tarea.empleados_asignados)
        return costo_total