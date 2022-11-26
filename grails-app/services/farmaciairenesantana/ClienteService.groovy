package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class ClienteService {

    def save(Cliente cliente) {
        cliente.save()
    }
}
