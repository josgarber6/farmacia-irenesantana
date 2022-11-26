package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class ClienteService {

    Cliente createClient(String nombre, String apellido, String dni) {
        def cliente = new Cliente(nombre: nombre, apellido: apellido, dni: dni)
        cliente.save()
        cliente
    }

    void updateClient(Cliente cliente, String nombre, String apellido, String dni) {
        cliente.nombre = nombre
        cliente.apellido = apellido
        cliente.dni = dni
        cliente.save()
    }

    def save(Cliente cliente) {
        cliente.save()
    }
}
