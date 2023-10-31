let respuesta; 

function mayorMenorEdad(){
    var edad=parseInt(document.getElementById("edad").value);
    if(edad>=0 && edad<120){
        if (edad >= 18){
            respuesta="Eres mayor de edad";
        }
        else{
            respuesta="Eres menor de edad";
        }    
        }
    
    else{
        respuesta="Ingresa un valor válido";
    }
    document.getElementById("respuesta").textContent = respuesta;
}
