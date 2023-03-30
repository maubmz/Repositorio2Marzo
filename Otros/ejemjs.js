window.onclick = function(){
    var item = document.getElementById("uno");
    item.style.color = "red";

    var items = document.getElementsByClassName("Clase0");
    for(var i  = 0; i < items.length ;i++){
        items[i].style.backgroundColor = "yellow"
    }
}

document.getElementById("uno").addEventListener("click",function(){
    var num1 = document.getElementById("input1").value; 
    var num2 = document.getElementById("input2").value;
    suma(num1 , num2);
    document.getElementById("idResultado").innerHTML = suma(num1 , num2); 
})