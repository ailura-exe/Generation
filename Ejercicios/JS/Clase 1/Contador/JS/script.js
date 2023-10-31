var contador = 0
/*la variable siempre se inicializa FUERA de la función*/

function contarClicks(){
    document.getElementById("contador").textContent=contador++;
}