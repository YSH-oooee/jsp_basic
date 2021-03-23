package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")		// url ���� ���, ����ڰ� ������Ʈ �̸�/url �̸����� ���ý��� ����
public class Join extends HttpServlet {
	
	private static final long serialVersionUID = 1L;		// servlet ���� ��, �⺻������ ����(�ǹ� ���� ��)
    
//������
//    public Join() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	// get �������� ��û�� ������ ��, �Ʒ��� �޼ҵ� ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	// post �������� ��û�� ������ ��, �Ʒ��� �޼ҵ� ����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	// ���� �ΰ��� ���� ���� �������� �ʰ�, ���������� �Ʒ��� �޼ҵ带 �̿��Ͽ� ���
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ������ �̵� ���
		// ������ ��� : "��Ű����, jsp���ϸ�"
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/01_join.jsp");
		dis.forward(request, response);
		
	}

}
