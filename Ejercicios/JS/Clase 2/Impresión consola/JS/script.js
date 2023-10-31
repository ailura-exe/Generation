 const nombre= prompt("¿Cómo te llamas?");
 const edad=parseInt(prompt("¿Qué edad tienes?"));
 const ciudad= prompt("¿En qué ciudad vives?")

 const persona ={
    nombre: nombre,
    edad: edad,
    ciudad: ciudad
 }

const esMayor = edad>=18;


alert("Tu nombre es: " + persona.nombre);
alert("Tu edad es: " + persona.edad);
alert("Vives en:" + persona.ciudad);
alert("¿Eres mayor de edad?" + esMayor);