    1. Diagrama de Clases: Sistema de Gestión de Bibliotecas
Aquí te describo las clases principales y sus relaciones:

-Clases y Atributos/Operaciones Libro

-Atributos: título, autor, ISBN, género, disponibilidad
Operaciones: actualizarDisponibilidad(), obtenerDetalles()
Usuario

-Atributos: nombre, ID_usuario, tipoUsuario (estudiante, docente, externo)
Operaciones: registrar(), solicitarLibro(), devolverLibro()
Bibliotecario (hereda de Usuario)

-Atributos: ID_bibliotecario
Operaciones: agregarLibro(), eliminarLibro(), gestionarPrestamos()
Prestamo

-Atributos: fechaInicio, fechaFin, estado
Operaciones: crearPrestamo(), verificarMulta()
Reserva

-Atributos: fechaReserva, estado
Operaciones: crearReserva(), cancelarReserva()

-Relaciones
-Usuario realiza Reserva (1 a muchos).
-Reserva está asociada a Libro (1 a 1).
-Prestamo está vinculado a Libro (1 a 1).
-Bibliotecario gestiona Libro (muchos a muchos).





   2. Diagrama de Secuencia: Reservar un Libro
Participantes: Usuario, Sistema, Libro, Reserva

-Usuario selecciona un libro y solicita reserva.
-El Sistema verifica disponibilidad del libro.
-Si está disponible, el Sistema registra la reserva.
-El Sistema actualiza el estado del libro como "reservado".
 Se confirma la reserva al Usuario.







   3. Diagrama de Casos de Uso: Sistema de Gestión de Tareas
Actores:

-Usuario (principal).
-Administrador (gestiona usuarios y permisos).
-Casos de Uso Principales:

-Crear tarea.
-Editar tarea.
-Marcar tarea como completada.
-Eliminar tarea.
-Visualizar tareas pendientes/completadas.
-Relaciones:
-Extiende: El caso de "Visualizar tareas" extiende "Crear tarea".
-Incluye: "Editar tarea" incluye validación de permisos.
-¿Deseas que cree los diagramas directamente? Puedo generarlos visualmente para ti.