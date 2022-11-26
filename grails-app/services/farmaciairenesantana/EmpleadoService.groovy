package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class EmpleadoService {

    Empleado createEmpleado(String nombre, Rol rol, Integer numVendedor, String clave) {
        def empleado = new Empleado(nombre: nombre, rol: rol, numVendedor: numVendedor, clave: clave)
        empleado.save()
        empleado
    }

    void updateEmpleado(Empleado empleado, String nombre, Rol rol, Integer numVendedor, String clave) {
        empleado.nombre = nombre
        empleado.rol = rol
        empleado.numVendedor = numVendedor
        empleado.clave = clave
        empleado.save()
    }

    def save(Empleado empleado) {
        empleado.save(empleado)
    }
}
