import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class Venta {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Integer id
  Date fecha
  TipoPago tipoPago
  // Double getPrecioTotal() {
  //   return null;
  // }

  Venta(Date fecha, TipoPago tipoPago) {
    fecha = fecha
    tipoPago = tipoPago
  }
}