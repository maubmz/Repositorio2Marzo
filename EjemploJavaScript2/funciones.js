/**
 * @author Javier
 */
window.onload=iniciaDatos;

/**
 * Funcion que se manda a llamar
 * al cargar la pagina HTML
 */
function iniciaDatos() {
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;
}

/**
 * Funcion que valida si el usuario quiere salir del sitio o no
 */

function validaSalir() {
    if(confirm("Desea salir del sitio?")) {
        alert("Nos vamos a google");
        return true; //regresamos verdadero para salir
    }
    else {
    alert("Nos quedamos en el sitio");
    return false; //regresamos falso para quedarnos
    }
}

/**
 * Funcion que pide una cadena a buscar en google
 */
function busqueda() {
    //con la funcion prompt capturamos informacion del usuario
    var respuesta= prompt("Escribe la cadena a buscar:", "");
    //si hubo respuesta concatenamos la cadena a buscar
    //al link de google
    if(respuesta) {
        alert("Tu respuesta fue:" + respuesta);
        //el elemento operador this nos sirve para referenciar
        //al elemento que provoco el evento, en este caso
        //el elemento con identificador "linkSearch"
        //y concatenamos la respuesta como un parametro
        //de una peticion get
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo link:" + nuevoLink);
        //redireccionamos el link   
        window.location= nuevoLink;
        //regresamos false, sino nos lleva al link originalmente
        //registrado en el elemento "linkSearch"
        return false;

    }
    else{
        alert("No proporcionaste ninguna cadena a buscar");
        return false;
    }
}