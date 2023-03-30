let resultado = document.querySelector('.resultado');
let calculo="";


function addNumber(numero1){
    resultado;
    console.log("aniadir numero");
    if(resultado.value === '0'){
        resultado.value = numero1;
    }else{
        resultado.value += numero1;
    }

}

function operadores(operador){
    calculo += resultado.value + operador;
    resultado.value = calculo;
    // if(calculo.value === ){
    // }
}

function borrar(){
    resultado.value = "0";
    calculo = "";
}

function calculoFinal(){
    calculo = resultado.value;
    resultado.value = eval(calculo);
    calculo = "";
}

function borrarNumero(){
    resultado.value = resultado.value.slice(0,-1);
}
