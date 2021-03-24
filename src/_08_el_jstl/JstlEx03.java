package _08_el_jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _04_bean.ProductBean;

@WebServlet("/JstlEx03")
public class JstlEx03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] datas = {"������1", "������2", "������3", "������4", "������5"};
		
		request.setAttribute("datas", datas);		//request�� datas�� ��� �Ʒ��� ��η� ����
		
		ArrayList<ProductBean> productList = new ArrayList<ProductBean>();
		
		for (int i = 1; i <= 10; i++) {
			ProductBean product = new ProductBean();
			product.setPdCd("P00" + i);
			product.setPdNm("���� Ű���� ����" + i);
			product.setDeptCd("dept" + i);
			product.setDeptNm("����� " + i + "��");
			product.setMgrNm("ȫ�浿");
			
			productList.add(product);
		}
		
		request.setAttribute("productList", productList);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter08_el_jstl/jstlEx03.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
