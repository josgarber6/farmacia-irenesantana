import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class Empleado {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Integer id
  String nombre
  Rol rol
  Integer numVendedor
  String clave

  Empleado(String nombre, Rol rol, Integer numVendedor, String clave) {
    nombre = nombre
    rol = rol
    numVendedor = numVendedor
    clave = clave
  }

}