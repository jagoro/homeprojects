<html>
<head>
    <title>Alta de Alumnos</title>
</head>
<body>
<!--
<form name="datos" action="${pageContext.request.contextPath}/alumno/saveDTO" method="post">
    <label for="idPaterno">Paterno</label> : <input type="text" name="apePaterno" id="idPaterno"/><br/>
    <label for="idMaterno">Materno</label> : <input type="text" name="apeMaterno" id="idMaterno"/><br/>
    <label for="idNombres">Nombres</label> : <input type="text" name="nombres" id="idNombres"/><br/>
    <input type="submit" value="Guardar"/>
</form>
-->
<form action="${pageContext.request.contextPath}/alumno/savePOSTDTO" method="post">
    <label for="idPaterno">Paterno</label> : <input type="text" name="apePaterno" id="idPaterno"/><br/>
    <label for="idMaterno">Materno</label> : <input type="text" name="apeMaterno" id="idMaterno"/><br/>
    <label for="idNombres">Nombres</label> : <input type="text" name="nombres" id="idNombres"/><br/>
    <label for="idfecna">Fec. Nac.</label> : <input type="date" name="fecnac" id="idfecna" /><br/>
    <label for="idEmail">Email</label> : <input type="email" name="email" id="idEmail" /><br/>
    <label for="idEmail">Genero</label> :
    Femenino : <input type="radio" name="genero" value="mujer" /><br/>
    Masculino: <input type="radio" name="genero" value="hombre" /><br/>
    <label for="idNivel">Nivel</label>
    <select name="nivel" id="idNivel">
        <option value="1">Inicial</option>
        <option value="2">Primaria</option>
        <option value="3">Secundaria</option>
    </select>

    <input type="submit" value="Guardar"/>
</form>
<p>${nombre}</p>

</body>
</html>
