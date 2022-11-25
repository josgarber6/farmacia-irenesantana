import grails.gorm.services.Service

@Service(Pedido)
interface PedidoService {
    Pedido save(String proveedor, Date fecha, LocalTime hora, Estado, estado, String clave)
}