class Pedido {
  static mapping = {
    id generator: 'id'
  }
  String proveedor
  Date fecha
  LocalTime hora
  Estado estado
  String clave

  public Double getPrecioTotal() {
    return null
  }
}