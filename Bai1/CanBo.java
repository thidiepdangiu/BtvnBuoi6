import java.util.Scanner;

public class CanBo {
	
	private Scanner sc = new Scanner(System.in);
	private int id;
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo(int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public CanBo() {
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public int getNamSinh() {
		return namSinh;
	}


	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public void input() {
		System.out.print("Nhập id: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập năm sinh: ");
		namSinh = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập giới tính: ");
		gioiTinh = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
	}
	public void output() {
		System.out.println("Id: "+id);
		System.out.println("Họ tên: "+hoTen);
		System.out.println("Năm sinh: "+namSinh);
		System.out.println("Giới tính: "+gioiTinh);
		System.out.println("Địa chỉ: "+diaChi);
		
	}
}
