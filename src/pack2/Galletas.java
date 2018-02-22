package pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Galletas
 */
@WebServlet("/Galletas")
public class Galletas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Galletas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
				String apellidos = request.getParameter("apellidos");
				String email = request.getParameter("email");
				// Se crea el objeto usuario (se supone que existe la clase Usuario)
				Usuario usuario = new Usuario(email, nombre, apellidos);
				// Y se guarda en una base de datos (igualmente se supone implementada)
				Cookie c = new Cookie("usernombreCookie", nombre);
				c.setMaxAge(60*60*24*365*2); //Establece el tiempo a 2 años
				c.setPath("/");
				response.addCookie(c);
				//PrintWriter html = response.getWriter();
				//html.print();
				//Para eliminar cookies
				//c.setMaxAge(0);
				//c.setPath("/");
				//response.addCookie(c);
				
				
	}

}
