import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class Pedido {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Integer id
  String proveedor
  Date fecha
  Date hora
  Estado estado
  String clave

  // public Double getPrecioTotal() {
  //   return null
  // }

  Pedido(String proveedor, Date fecha, Date hora, Estado estado, String clave) {
    proveedor = proveedor
    fecha = fecha
    estado = estado
    clave = clave
  }

}