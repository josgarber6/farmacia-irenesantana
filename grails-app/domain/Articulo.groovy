import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class Articulo {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Integer id
  String denominacion
  String codigoNacional
  Date caducidad
  Integer existencia
  String lote
  Integer tenencia
  Integer minimo
  Double precioAlbaran
  Boolean requiereReceta
  Double pvp
  String imagen
  String observacion

  static constraints = {
    denominacion blank: false
    codigoNacional blank: false
    caducidad blank: false
    existencia blank: false
    lote blank: false
    minimo min: 0
    observacion max: 50
  }
}