package farmaciairenesantana

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    ClienteService clienteService
    EmpleadoService empleadoService
    PedidoService pedidoService
    VentaService ventaService


    Date date1 = new Date()
    Date date2 = new Date()
    Date date3 = new Date()
    Date date4 = new Date()
    Date date5 = new Date()
    Date date6 = new Date()
   
    Date hora1 = new Date()
    Date hora2 = new Date()
    Date hora3 = new Date()
    Date hora4 = new Date()

    def init = { servletContext ->

    new Cliente(nombre: 'Patricia', apellido: 'Navarro', dni: '25965651P').save()
    new Cliente(nombre: 'Karen', apellido: 'Ortega', dni: '45239003G').save()
    new Cliente(nombre: 'Jay', apellido: 'Caldwell', dni: '75945019P').save()
    new Cliente(nombre: 'Shawn', apellido: 'Barnes', dni: '45244499A').save()

    // clienteService.save('Patricia', 'Navarro', '25965651P').save()
    // clienteService.save('Karen', 'Ortega', '45239003G').save()
    // clienteService.save('Jay', 'Caldwell', '75945019P').save()
    // clienteService.save('Shawn', 'Barnes', '45244499A').save()

    new Empleado(nombre: 'Martin', rol: Rol.TITULAR, numVendedor: 1, clave: 'abcd').save()
    new Empleado(nombre: 'Candela', rol: Rol.TECNICO, numVendedor: 2, clave: 'ab12').save()
    new Empleado(nombre: 'Sergio', rol: Rol.AUXILIAR, numVendedor: 3, clave: 'cd34').save()
    new Empleado(nombre: 'Ines', rol: Rol.ADJUNTO, numVendedor: 4, clave: '1234').save()
    // empleadoService.save('Martin', Rol.TITULAR , 1, 'abcd').save()
    // empleadoService.save('Candela',Rol.TECNICO, 2 , 'ab12').save()
    // empleadoService.save('Sergio',Rol.AUXILIAR, 3 , 'cd34').save()
    // empleadoService.save('Ines',Rol.ADJUNTO, 4 , '1234').save()

    new Pedido(proveedor: 'proveedor1', fecha: date1 , hora: hora1 , estado: Estado.PENDIENTE, clave: 'clave1').save()
    new Pedido(proveedor: 'proveedor2', fecha: date2 , hora: hora2 , estado: Estado.RECEPCIONADO, clave: 'clave2').save()
    new Pedido(proveedor: 'proveedor3', fecha: date3 , hora: hora3 , estado: Estado.CANCELADO, clave: 'clave3').save()
    new Pedido(proveedor: 'proveedor4', fecha: date4 , hora: hora4 , estado: Estado.INCOMPLETO, clave: 'clave4').save()
    // pedidoService.save('proveedor1', date1 , hora1 , Estado.PENDIENTE, 'clave1').save()
    // pedidoService.save('proveedor2', date2 , hora2 , Estado.RECEPCIONADO, 'clave2').save()
    // pedidoService.save('proveedor3', date3 , hora3 , Estado.CANCELADO, 'clave3').save()
    // pedidoService.save('proveedor4', date4 , hora4 , Estado.INCOMPLETO, 'clave4').save()

    new Venta(fecha: date5 , tipoPago: TipoPago.EFECTIVO).save()
    new Venta(fecha: date5 , tipoPago: TipoPago.EFECTIVO).save()
    new Venta(fecha: date6 , tipoPago: TipoPago.TARJETA).save()
    }
    def destroy = {
    }
}
