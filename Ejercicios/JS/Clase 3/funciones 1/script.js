function tablaMultiplicar(){
    const numero= parseInt(prompt("Ingrese el número: "));

    for (let i=0; i<=10; i++){
        console.log(`${numero} x ${i} = ${numero*i}`);    
    }

}
tablaMultiplicar(1);