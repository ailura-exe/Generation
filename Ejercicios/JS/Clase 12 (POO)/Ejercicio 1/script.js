class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;

    }
    saludar() {
        console.log(`Hola soy ${this.nombre} y tengo ${this.edad} años`); 
    }
}

let odel = new Persona("Odel", 1);
odel.saludar()