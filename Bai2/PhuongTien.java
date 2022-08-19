import java.util.Scanner;

public class PhuongTien {
	Scanner sc = new Scanner(System.in);
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thuePhaiNop;
	public PhuongTien(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.thuePhaiNop = thuePhaiNop;
	}
	
	public PhuongTien() {
		super();
	}

	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public double getThuePhaiNop() {
		return thuePhaiNop;
	}
	public void setThuePhaiNop(double thuePhaiNop) {
		this.thuePhaiNop = thuePhaiNop;
	}
	public void input() {
		System.out.print("Nhập vào tên chủ xe: ");
		tenChuXe = sc.nextLine();
		System.out.println("Nhập vào loại xe: ");
		loaiXe = sc.nextLine();
		System.out.println("Nhập vào dung tích: ");
		dungTich = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập vào giá trị xe: ");
		triGia = sc.nextDouble();
		if(dungTich<100) {
			thuePhaiNop = (double)2/100*triGia;
		}else if(dungTich>=100 && dungTich<200) {
			thuePhaiNop = (double)6/100*triGia;
		}else thuePhaiNop = (double)10/100*triGia;
	}
	
	public void output() {
		 System.out.printf("%-20s%-20s%-20d%-20f%-20f\n", tenChuXe, loaiXe, dungTich, triGia, thuePhaiNop);
	}
}
