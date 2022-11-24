class Empleado {
  static mapping = {
    id generator: 'id'
  }
  String nombre
  Rol rol
  Integer numVendedor
  String clave
}