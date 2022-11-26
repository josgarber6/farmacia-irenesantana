import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

class Cliente {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  Integer id
  String nombre
  String apellido
  String dni

  static constraints = {
    nombre blank: false
    apellido blank: false
  }

  Cliente(String nombre, String apellido, String dni) {
    nombre = nombre
    apellido = apellido
    dni = dni
  }

}