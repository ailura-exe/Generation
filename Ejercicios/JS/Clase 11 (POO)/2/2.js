// Creo una funcion constructora 
function Libro (autor, titulo, cantPaginas) {
    this.autor = autor;
    this.titulo = titulo;
    this.cantPaginas = cantPaginas; 
}

let nuevoLibro = new Libro ("Stephen King", "IT", 500); // Creo una instancia del constructor
// Todas las clases deben tener un constructor 

class Papel { // Declarar la clase 
    constructor(alto, ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
}

let Cartulina = class {  // Expresion de clase ANONIMA a traves de una variable 
    constructor (color,tamaño) {
        this.color = color;
        this.tamaño = tamaño
    }
}
let deportista1 = new Deportista ("Nairo", "Quintana"); // Creo una instancia de la clase 

// Subclases 
class Futbolista extends Deportista { // Palabra clave extends indica que hereda de ...
    constructor(nombre, apellido, goles) {
        super(nombre, apellido); // Palabra clave que indica que atributo va a heredar de la clase 
        this.goles = goles;
    }
}

let nuevoDeportista = new Futbolista ("James", "Rodriguez" , 10);