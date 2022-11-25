package farmaciairenesantana

class BootStrap {

    ClienteService clienteService
    EmpleadoServie empleadoServie
    PedidoService pedidoService
    VentaService ventaService

    Date date1 = new Date()
    Date date2 = new Date()
    Date date3 = new Date()
    Date date4 = new Date()
    Date date5 = new Date()
    Date date6 = new Date()
   
    LocalTime hora1 = new LocalTime()
    LocalTime hora2 = new LocalTime()
    LocalTime hora3 = new LocalTime()
    LocalTime hora4 = new LocalTime()

    def init = { servletContext ->

    clienteService.save('Patricia', 'Navarro', '25965651P').save()
    clienteService.save('Karen', 'Ortega', '45239003G').save()
    clienteService.save('Jay', 'Caldwell', '75945019P').save()
    clienteService.save('Shawn', 'Barnes', '45244499A').save()

    empleadoServie.save('Martin', Rol.TITULAR , 1, 'abcd').save()
    empleadoServie.save('Candela',Rol.TECNICO, 2 , 'ab12').save()
    empleadoServie.save('Sergio',Rol.AUXILIAR, 3 , 'cd34').save()
    empleadoServie.save('Ines',Rol.ADJUNTO, 4 , '1234').save()


    pedidoService.save('proveedor1', date1 , hora1 , Estado.PENDIENTE, 'clave1').save()
    pedidoService.save('proveedor2', date2 , hora2 , Estado.RECEPCIONADO, 'clave2').save()
    pedidoService.save('proveedor3', date3 , hora3 , Estado.CANCELADO, 'clave3').save()
    pedidoService.save('proveedor4', date4 , hora4 , Estado.INCOMPLETO, 'clave4').save()

    ventaService.save(date5 , TipoPago.EFECTIVO).save()
    ventaService.save(date6 , TipoPago.TARJETA).save()
    }
    def destroy = {
    }
}
