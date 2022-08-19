import java.util.Scanner;

public class NhanVien extends CanBo {
	private Scanner sc = new Scanner(System.in);
	private String congViec;
	public NhanVien(int id, String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
		super(id, hoTen, namSinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}
	
	public NhanVien() {
		super();
	}

	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	public void input() {
		super.input();
		System.out.print("Nhập vào công việc: ");
		congViec = sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.println("Công việc: "+congViec);
	}

}
