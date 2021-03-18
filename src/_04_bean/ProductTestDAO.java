package _04_bean;

public class ProductTestDAO {
	
	public void printData(ProductBean pb) {
		
		System.out.println("상품코드 : " + pb.getPdCd());
		System.out.println("상품이름 : " + pb.getPdNm());
		System.out.println("부서코드 : " + pb.getDeptCd());
		System.out.println("부서이름 : " + pb.getDeptNm());
		System.out.println("담당자이름 : " + pb.getMgrNm());
		
	}

}
