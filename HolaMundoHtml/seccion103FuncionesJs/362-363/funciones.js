window.onload = cargarImagenes;

function cargarImagenes(){
    for(var i = 0; i < document.images.length; i++){
        if(document.images[i].parentNode.tagName == "A"){
            configuraRollover(document.images[i]);
        }
    }
}

function configuraRollover(imagen){
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "boton_off.jpg";
    imagen.onmouseout = cambiaOff;
    
    imagen.imageOn = new Image();
    imagen.imageOn.src = "boton_on.jpg";
    imagen.onmouseover = cambiaOn;
}

/*Estas funciones se ejecutan segun el evento que se dispare pero no es el iniciar de la pagina
si no depende del boton que se presiones, son conocidas como handlers*/
//Se asocio el evento onmouseout

function cambiaOff() {
    this.src = this.imagenOff.src;//Tomamos los valores asociados
}

//Se asocio el evento onmouserover
function cambiaOn() {
    this.src = this.imageOn.src;//Tomamos los valores asociados
}