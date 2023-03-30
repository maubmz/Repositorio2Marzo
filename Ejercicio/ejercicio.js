let resultado=document.querySelector('.resultado');
let calculo = "";

function addNumber(n1){ 
    console.log("añadir numero")
    if(resultado.value === '0'){
        resultado.value = n1;
    }else{
        resultado.value += n1;
    }
}
function operadores(operador){
    calculo += resultado.value + operador;
    resultado.value = calculo;
}
function eliminar(){
    resultado.value = "0";
    calculo = "";
}
function resultado1(){
    calculo = resultado.value;
    resultado.value = eval(calculo);
    calculo = "";
}
function eliminarUno(){
    resultado.value = resultado.value.slice(0,-1);
}

