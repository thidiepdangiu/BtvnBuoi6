import java.util.Scanner;

public class KySu extends CanBo {
	private Scanner sc = new Scanner(System.in);
	private String nganh;

	public KySu(int id, String hoTen, int namSinh, String gioiTinh, String diaChi,  String nganh) {
		super(id, hoTen, namSinh, gioiTinh, diaChi);
		this.nganh = nganh;
	}
	
	public KySu() {
		super();
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public void input() {
		super.input();
		System.out.print("Nhập vào ngành: ");
		nganh = sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.println("Ngành: "+nganh);
	}

}
