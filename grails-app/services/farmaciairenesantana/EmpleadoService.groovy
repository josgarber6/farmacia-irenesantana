package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class EmpleadoService {

    def save(Empleado empleado) {
        empleado.save(empleado)
    }
}
