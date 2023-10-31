const request=require('supertest');
const app=require('./app')

describe('Pruebas unitarias para el sistema de creación y obtención de usuarios', ()=>{
    it('Debería crear un usuario y devolverlo cla hacer una solicitud POST', async()=>{
        
        const newUser={     //Define un nuevo usuario que se utilizará en la prueba
            id: 1,
            name: 'Juliana',
            email:'example@email.com'            
        };

        const response=await request(app)   //realiza una solicitud POST  a '/users'  con el nuevo usuario como dato
        .post('/users')
        .send(newUser)

        expect(response.status).toBe(201)    //verifica que el codigo del estado de la respuesta sea el 201*
        expect(response.body).toEqual(newUser);     //verifica que el cuerpo de la respuesta sea igual al nuevo usuario
    })   

    it('Debería obtener la lista de usuarios al hacer una solicitud GET', async() => {
        // Realiza una solicitud GET a la raíz
        const response = await request(app).get('/users');

        // Verificar que el código del estado sea igual 200 (Ok)
        expect(response.status).toBe(200);
        // Verificar que el cuerpo de la respuesta sea un arreglo
        expect(Array.isArray(response.body)).toBe(true);
    });
});


