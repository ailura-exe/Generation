const express=require('express');
const app=express();

app.use(express.json());
const users=[];

app.post('/users', (req, res)=>{
    const {username, email}=req.body;


    if(!username || !email){        // verificar si el nombre de usuario o el correo sean correctos
        return res.status(400).json({error: 'Usuario o correo son incorrectos'});   // si falta alguno de los campos responde con un codigo que dice que son incorrectos 
    }

    const newUser={username, email};
    users.push(newUser);
    res.status(201).json(newUser);
});

app.get('/users', (res, res)=>{
    res.status(200).json(users)
})

module.exports=app;