<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>Sign up</title>
   		<link href="Assets\css\styles.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/css/uikit.min.css" />
        <script src="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/js/uikit.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/uikit@3.6.19/dist/js/uikit-icons.min.js"></script> 
	</head>
    <body>
        <div class="signup">
            <form action="nusoap-0.9.5/client.php" method="post">
                <h3>Sign up</h3>
                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: user"></span>
                        <input name="name" class="uk-input" type="text" placeholder="Full name" autocomplete="off">
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: mail"></span>
                        <input name="email" class="uk-input" type="text" placeholder="Email" autocomplete="off">
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: user"></span>
                        <input name="uid" class="uk-input" type="text" placeholder="Username" autocomplete="off">
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: lock"></span>
                        <input name="pass" class="uk-input" type="password" placeholder="Password">
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: lock"></span>
                        <input name="rpass" class="uk-input" type="password" placeholder="Repeat Password">
                    </div>
                </div>
                
                <div>
                    <input type="text" name="funcion" value="Signup" hidden />
                    <button type="submit" name="submit" class="uk-button uk-button-primary uk-width-1-1"><span uk-icon="icon: sign-in"></span> Sign up</button>
                </div>
            </form>                
            <div>
                <p>Do you have an account? <a href='index.jsp'>Log In</a></p>
            </div> 
        </div>
    </body>
</html>
