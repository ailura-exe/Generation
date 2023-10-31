// Creo un obj con sus atributos y metodos
let perro = {
    nombre: "Lucy",
    color: "Blanco",
    edad: 4,
    ladrar() { // Creo un metodo 
        console.log("Guau");
    },
    saludar() {
        console.log("Hola me llamo " + this.nombre);
    }
}



let perro2 = {
    nombre: "Toby",
    color: "Negro",
    edad: 7,
    ladrar() {
        console.log("Guau");
    }, 
    saludar() {
        console.log("Hola me llamo " + this.nombre);
    }

};

function cambiarEdad () {
    perro.edad = perro.edad + 1
};