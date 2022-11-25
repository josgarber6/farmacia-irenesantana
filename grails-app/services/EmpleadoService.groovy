import grails.gorm.services.Service

@Service(Empleado)
interface EmpleadoService {
    Empleado save(String nombre, Rol rol, Integer numVendedor, String clave)
}