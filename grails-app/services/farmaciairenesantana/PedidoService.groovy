package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class PedidoService {

    def save(Pedido pedido) {
        pedido.save(pedido)
    }
}
