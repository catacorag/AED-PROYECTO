<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
    <link href="Assets\css\styles.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/css/uikit.min.css" />
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/js/uikit-icons.min.js"></script>
</head>
    <body>
        <div class="login">
            <form action="login" method="POST">
                <h3>Login</h3>
                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: user"></span>
                        <input name="uid" class="uk-input" type="text" placeholder="Username or Email" autocomplete="off">
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: lock"></span>
                        <input name="pass" class="uk-input" type="password" placeholder="Password">
                    </div>
                </div>
                <div>
                    <input type="text" name="funcion" value="Login" hidden />
                    <button type="submit" name="submit" id="ingreso" class="uk-button uk-button-primary uk-width-1-1"><span uk-icon="icon: sign-in"></span> Login</button>
                </div>
            </form>
                <div>
                    <p>You don't have an account? <a href='main.jsp'>Sign Up</a></p>
                    <a class="xd" href='logout.php'><span uk-icon="icon: sign-out"></span>logout</a></p>
                </div>  
        </div>
    </body>	
</html>
<script type="text/javascript">
$(document).ready(function(){
    $('#ingreso').click(function() {
        var uid = $('#uid').val(); 
        var pass = $('#pass').val();        
        if(uid==""){
            alert("Campos Vacios!","Ingrese un usuario!");
            return false;
        }else if(pass=="") {
            alert("Campos Vacios!","Ingrese una contraseña!");
            return false;
        }else if(uid.length > 15 || pass.length > 8){
            alert("Exceso de caracteres!","usuario demasiado largo!");
            return false;
        }
        // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
        $.post('login', {
        	uid : uid,
        	pass : pass
        }, function(responseText) {
            $(location).attr('href',responseText);
                //redi(responseText);
        });
       // AgregarNuevaIncidencia(codsoli, titulo, descripcion, prioridad, estado, fecha);           
    });
});
</script>

