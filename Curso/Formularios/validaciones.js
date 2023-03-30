function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if(password.value == "" || password.value.length < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres")
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = forma.tecnologias;
    var checkSeleccionado = false;

    for(i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true
        }
    }

    if(!checkSeleccionado){
        alert("Debe proporcionar una tecnologia");
        return false;
    }

    var generos = forma.generos;
    var radioSeleccionado = false;

    for(i = 0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true
        }
    }

    if(!radioSeleccionado){
        alert("Debe proporcionar una genero");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if(ocupacion.value = ""){
        alert("Debe seleccionar una ocupacion")
        return false;
    }

    alert("Formulario validado, enviando datos....")
    return true;
}



