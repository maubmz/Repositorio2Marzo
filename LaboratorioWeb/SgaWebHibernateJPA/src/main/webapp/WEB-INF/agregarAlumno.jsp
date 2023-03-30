<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Agregar Alumno</title>
</head>
<body>
<hl>Agregar Alumno</hl>
<form name="forml" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
  Nombre: <input type="text" name="nombre"/>
  <br/>
  apellido: <input type="text" name="apellido"/>
  <br/>
  <br/>
  Datos Domicilio:
  <br/>
  Calle: <input type="text" name="calle">
  <br/>
  No.Calle: <input type="text" name="noCalle"/>
  <br/>
  Pais: <input type="text" name="pais"/>
  <br/>
  <br/>
  Datos de Contacto:
  <br/>
  Email: <input type="text" name="email">
  <br/>
  Telefono: <input type="tel" name="telefono"/>
  <br/>
  <input type="submit" name="Agregar" value="Agregar">
</form>
</body>
</html>
