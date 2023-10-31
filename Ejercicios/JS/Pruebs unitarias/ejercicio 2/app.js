//prueba unitaria a un sistema de creación y obtención de usuarios

const express=require('express');
const app=express;

app.use(express.json()); //habilitar uso de JSON para procesar solicitudes

const users=[]; //arreglo para almacenar los usuarios 

app.post('/users', (req, rest) => {     //definimos una ruta para un nuevo usuario

    const {id, name, email}=req.body;   // extrae los datos del cuerpo de la solicitud

    const newUser={id, name, email};    //crear un nuevo objeto de usuario con los datos proporcionados 

    users.push(newUser);    //agrega el nuevo usuario al arreglo que se inicializó

    res.status(201).json(newUser);
});

app.get('/users', (req, res)=>{ //definir una ruta GET para obtener la lista de usuarios
    res.status(200).json(users);    //si todo eestá correcto responderá con un mensaje que todo está ok (200)
}); 

module.exports=app;
