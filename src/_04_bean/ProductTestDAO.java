package _04_bean;

public class ProductTestDAO {
	
	public void printData(ProductBean pb) {
		
		System.out.println("��ǰ�ڵ� : " + pb.getPdCd());
		System.out.println("��ǰ�̸� : " + pb.getPdNm());
		System.out.println("�μ��ڵ� : " + pb.getDeptCd());
		System.out.println("�μ��̸� : " + pb.getDeptNm());
		System.out.println("������̸� : " + pb.getMgrNm());
		
	}

}
