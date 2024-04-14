// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    url = "usuarios";
    const request = await fetch (url, {
      method: 'GET',
      headers: {'Content-Type': 'application/json'},
    })

     const usuarios = await request.json();
     console.log(usuarios)



let listadoHTML = "";

usuarios.forEach(e => {
    let usuario = `<tr><td>${e.id}</td>
    <td>${e.nombre}</td>
    <td>${e.email}</td>
    <td>${e.telefono}</td>
    <td>${e.telefono}</td>
    <td>
        <a href="#" class="btn btn-danger btn-circle">
            <i class="fas fa-trash"></i>
        </a>
    </td>
    </tr>`


    listadoHTML += usuario;
});

     document.querySelector("#usuarios tbody").outerHTML = listadoHTML;
}


cargarUsuarios();
