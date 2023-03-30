function sumar(){
    try{
        var a = prompt("Valor a:" ,"");

        if(!a || isNaN(a)){
            throw new Error("Valor invalido de a:" + a)
        }
        var b = prompt("Valor de b:" ,"");

        if(!b || isNaN(b)){
            throw new Error("Valor invalido de a:" + b)
        }

        var c = parseInt(a) + parseInt(b);
        alert("La suma es:" + c);
    }catch(e){
        alert("El error es: " + e.message);
    }
}