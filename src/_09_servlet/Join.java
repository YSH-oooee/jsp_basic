package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")		// url 접근 경로, 사용자가 프로젝트 이름/url 이름으로 웹시스템 접근
public class Join extends HttpServlet {
	
	private static final long serialVersionUID = 1L;		// servlet 생성 시, 기본값으로 생성(의미 없는 듯)
    
//생성자
//    public Join() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	// get 형식으로 요청이 들어왔을 때, 아래의 메소드 동작
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	// post 형식으로 요청이 들어왔을 때, 아래의 메소드 동작
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	// 위의 두개를 굳이 따로 지정하지 않고, 관용적으로 아래의 메소드를 이용하여 사용
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 페이지 이동 방식
		// 포워딩 경로 : "패키지명, jsp파일명"
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/01_join.jsp");
		dis.forward(request, response);
		
	}

}
