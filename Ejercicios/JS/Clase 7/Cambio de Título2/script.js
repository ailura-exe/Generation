function cambiarTitulo(){
    let tituloElement=document.getElementById("titulos");

    if(tituloElement.innerHTML==="¡Hola mundo!"){
        tituloElement.innerHTML="Hello world"
    }else{
        tituloElement.innerHTML="Hallo Welt"
    }
}