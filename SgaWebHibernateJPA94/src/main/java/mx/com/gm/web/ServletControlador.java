package mx.com.gm.web;

import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        List<Alumno> alumnos = servicioAlumno.listarAlumnos();

        request.setAttribute("alumnos",alumnos);

        try {
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }


}
