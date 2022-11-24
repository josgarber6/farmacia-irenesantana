class Venta {
  static mapping = {
    id generator: 'id'
  }
  Date fecha
  TipoPago tipoPago
  Double getPrecioTotal() {
    return null;
  }
}