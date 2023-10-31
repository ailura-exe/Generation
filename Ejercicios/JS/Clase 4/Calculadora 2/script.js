function calculadora() {
    const num1=parseFloat(prompt("Ingrese el primer número: "));
    const num2=parseFloat(prompt("Ingrese el segundo número: "));

    const operacion=prompt("Ingrese la operación que desee realizar (+, -, *, /)");

    switch(operacion){
        case "+":
            alert("El resultado de la suma es: " + (num1+num2));
            break;
        case "-":
            alert("El resultado de la resta es: " + (num1-num2));
            break;
        case "*":
            alert("El resultado de la multiplicación es: " + (num1*num2));
            break;
        case "/":
            alert("El resultado de la división es: " + (num1/num2));
            break;    
        default:
            alert("La operacion ingresada no es válida");
    }
}

calculadora();