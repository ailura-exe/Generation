var colores=["red","green","blue","yellow","purple"];

var indice=0;

function cambiarColor(){
    document.body.style.backgroundColor=colores[indice];

    indice=(indice+1)% colores.length;
}
