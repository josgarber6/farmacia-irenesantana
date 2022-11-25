import grails.gorm.services.Service

@Service(Cliente)
interface ClienteService {
    Cliente save(String nombre, String appellido, String dni)
}