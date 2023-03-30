window.onload = cargarImagenes

function cargarImagenes(){
    for(var i = 0; i <document.images.length; i++){
        if(document.images[i].parentNode.tagName = "A"){
            congiguraRollover(document.images[i])
        }
    }
}

function congiguraRollover(imagen){
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "boton_off.jpg";
    imagen.onmouseout = cambiaOff;

    imagen.imagenOn = new Image;
    imagen.imagenOn.src ="boton_on.jpg";
    imagen.onmouseover = cambiaOn
}
// Se asocio al evento onmouseout
function cambiaOff(){
    this.src = this.imagenOff.src;
}

//Se asocio al evento onmouseover
function cambiaOn(){
    this.src = this.imagenOn.src; 
}