var variable = "wola";
const variableConstante = 19;
let variableLet = true;
console.log(variable +"Tengo estos años: " + variableConstante + variableLet);
let numero1 = 10;
let numero2 = 5;
console.log(numero1 + numero2)
function nombreDeLaFuncion(){
    return 2;
}

function suma(a,b){
    return a + b;
}
function resta(a, b){
    return a - b;
}
function division(a, b){
    return a / b;
}
function multiplicacion(a, b){
    return a * b;
}

console.log("Suma: " +suma(numero1,numero2) +" Resta: " +resta(numero1,numero2) + " Division: " + division(numero1,numero2))