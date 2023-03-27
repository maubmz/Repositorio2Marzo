<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Alumno</title>
</head>
<body>
    <h1>Inicio</h1>
    <form name = "form1" action = "${pageContext.request.contextPah}/ServletAgregar" method="post">
      Nombre: <input type="text" name = "nombre"/>
      <br/>
      Apellido: <input type="text" name = "apellido"/>
      <br/>
      <br/>
      Datos Domicilio
      <br/>
      Calle: <input type="text" name = "calle"/>
      <br/>
      No. Calle: <input type="text" name = "noCalle"/>
      <br/>
      Pais: <input type="text" name = "pais"/>
      <br/>
      Email: <input type="email" name = "email"/>
      <br/>
      Telefono: <input type="text" name = "telefono"/>
      <br/>
      <input type="submit" name="Agregar " value="Agregar">
    </form>
</body>
</html>
