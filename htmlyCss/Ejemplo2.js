window.onclick = function(){
    var elemento1 = document.getElementById("uno");
    elemento1.style.color = "red";
    var elementos = document.getElementsByClassName("clase_impar");
    for(var i = 0; i < elementos.length ; i ++){
        elementos[i].style.backgroundColor = "yellow";
    }

}

document.getElementById("uno").addEventListener("click",function(){
    var num1=document.getElementById("input1").value;
    var num2=document.getElementById("input2").value;
    suma(num1, num2);
    document.getElementById("idResultado").innerHTML=suma(num1, num2);

})
