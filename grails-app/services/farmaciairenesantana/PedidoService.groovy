package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class PedidoService {

    Pedido createPedido(String proveedor, Date fecha, Date hora, Estado estado, String clave) {
        Pedido pedido = new Pedido(proveedor: proveedor, fecha: fecha, hora: hora, estado: estado, clave: clave)
        pedido.save()
        pedido
    }

    void updatePedido(Pedido pedido, String proveedor, Date fecha, Date hora, Estado estado, String clave) {
        pedido.proveedor = proveedor
        pedido.fecha = fecha
        pedido.hora = hora
        pedido.estado = estado
        pedido.clave = clave
        pedido.save()
    }

    def save(Pedido pedido) {
        pedido.save(pedido)
    }
}
