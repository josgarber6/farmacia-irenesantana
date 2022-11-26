package farmaciairenesantana

import grails.gorm.transactions.Transactional

@Transactional
class VentaService {

    Venta createVenta(Date fecha, TipoPago tipoPago) {
        Venta venta = new Venta(fecha: fecha, tipoPago: tipoPago)
        venta.save()
        venta
    }

    void updateVenta(Venta venta, Date fecha, TipoPago tipoPago) {
        venta.fecha = fecha
        venta.tipoPago = tipoPago
        venta.save()
    }

    def save(Venta venta) {
        venta.save(venta)
    }
}
