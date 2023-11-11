package Com.MphasisUser.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String n = request.getParameter("name");
		String pwd = request.getParameter("password");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(n.equals("Yogendra") && pwd.equals("Yogendra@123")) {
			HttpSession hs=request.getSession();
			hs.setAttribute("uname", n);
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("sorry! username or password incorrect..... Try Again!");
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		doGet(request, response);
	}

}
