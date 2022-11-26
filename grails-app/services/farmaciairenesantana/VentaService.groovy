package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class VentaService {

    def save(Venta venta) {
        venta.save(venta)
    }
}
