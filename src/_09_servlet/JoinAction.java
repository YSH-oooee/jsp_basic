package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinAction")
public class JoinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		String[] arr = request.getParameterValues("hobby");
		
		String hobby = "";
		for (int i = 0; i < arr.length; i++) {
			hobby += arr[i];
			
			if (i != arr.length - 1) {
				hobby += ", ";
			}
		}
		
		MemberDTO mdto = new MemberDTO();
		
		mdto.setId(id);
		mdto.setPw(pw);
		mdto.setName(name);
		mdto.setEmail(email);
		mdto.setHobby(hobby);
		
		// jsp로 데이터 전송방법
		// request.setAttribute(속성명 , 값);
		request.setAttribute("mdto", mdto);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/02_joinAction.jsp");
		dis.forward(request, response);
		
	}

}
