let input = document.querySelector('.resultado');
let calculo = "";
function addNumber(n1){
    
    if(input.value === '0'){
        input.value = n1;
    }else{
        input.value += n1;
    }
}

function operadores(operador){
    calculo += input.value + operador;
    input.value = calculo; 
}

function borrar(){
    input.value = "";
    calculo = "";
}

function calculoFinal(){
    calculo = input.value;
    input.value = eval(calculo); 
    calculo = "";
} 

function borrarNumero(){
    input.value = input.value.slice(0,-1);
}