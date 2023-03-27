<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Modificar Alumno</title>
</head>
<body>
<h1>Inicio</h1>
<form name="form1" action="${pageContext.request.contextPah}/ServletModificar" method="post">
    <input type="hidden" name="idAlumno " value="${alumno.idAlumno }"/>

    Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/>
    <br/>
    Apellido: <input type="text" name="apellido" value="${alumno.apellido}"/>
    <br/>
    <br/>
    Datos Domicilio
    <br/>
    Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}"/>
    <br/>
    No. Calle: <input type="text" name="noCalle" value="${alumno.domicilio.calle}"/>
    <br/>
    Pais: <input type="text" name="pais" value="${alumno.domicilio.pais}"/>
    <br/>
    <br/>
    Datos Contacto:
    <br/>
    Email: <input type="email" name="email" value="${alumno.domicilio.email}"/>
    <br/>
    Telefono: <input type="text" name="telefono" value="${alumno.domicilio.telefono}"/>
    <br/>
    <input type="submit" name="Modificar " value="Modificar">
    <input type="submit" name="Eliminar " value="Eliminar">
</form>
</body>
</html>
