

function RegistrarPersona(codsoli, titulo, descripcion, prioridad, estado, fecha) {
    cad =   "codsoli=" + codsoli +
            "&titulo=" + titulo + 
            "&descripcion=" + descripcion + 
            "&prioridad=" + prioridad + 
            "&estado=" + estado + 
            "&fecha=" + fecha;
    $.ajax({
        type:"POST",
        url:'RegIncidencia.java',
        data:cad,
        success:function(r){    
            if(r==1){
                $('#tablainci').load('principal.jsp');
                $('#modalRegistroIncidencias').modal('hide') 
                $('#codsoli').val("");
                $('#titulo').val("");   
                $('#descripcion').val(""); 
                $('#prioridad').val(""); 
                $('#estado').val(""); 
                $('#fecha').val("");                           
                alert("Incidencia registrada con exito!");
                
            }else {
                $('#modalRegistroIncidencias').modal('hide')
                alert("Error al registrar!");
            }
        }
    }); 
}

