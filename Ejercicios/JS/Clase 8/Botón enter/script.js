 const input=document.getElementById("myInput");
 const list=document.getElementById("myList");

 input.addEventListener("keyup", function(event){//keyup caputa el enter para ingresar el contenido

    if(event.key==="Enter" && input!==""){
        const newItem=document.createElement("li");
        newItem.textContent=input.value;
        list.appendChild(newItem);
        input.value="";
    }

 }) 