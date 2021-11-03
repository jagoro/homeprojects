// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios().then(r => {console.log("ok")});
  $('#usuarios').DataTable();
});
// para hacer una llamado al servidor tenemos que usar la funcion fetch
async function cargarUsuarios() {
  const request = await fetch("usuarios", {
    method: "GET",
    headers: {
      "Accept": "application/json",
      "Content-Type": "application/json"
    }
    // BODY se usa cuando enviamos una peticion POST, PUT ó DELETE
    // body: JSON.stringify({a: 1, b: "Textual content"})
  });

  const usuarios = await request.json();

  let listadoHtml = ``;

  for (let usuario of usuarios) {
    let usuarioHtml = "" +
        "<tr>" +
        "    <td>"+usuario.id+"</td>" +
        "    <td>"+usuario.nombre+" "+usuario.apellido+"</td>" +
        "    <td>"+usuario.email+"</td>" +
        "    <td>"+usuario.telefono+"</td>" +
        "    <td>"+
        "        <a href=\"#\" class=\"btn btn-danger btn-circle btn-sm\">" +
        "            <i class=\"fas fa-trash\"></i>" +
        "        </a>" +
        "    </td>" +
        "</tr>";
    listadoHtml += usuarioHtml;
  }

  document.querySelector("#usuarios tbody").outerHTML=listadoHtml;

}
