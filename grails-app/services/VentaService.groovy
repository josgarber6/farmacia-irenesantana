import grails.gorm.services.Service

@Service(Venta)
interface VentaService {
    Cliente save(Date fecha, TipoPago tipoPago)
}