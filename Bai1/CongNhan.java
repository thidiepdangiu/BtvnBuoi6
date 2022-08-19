import java.util.Scanner;

public class CongNhan extends CanBo {

	private Scanner sc = new Scanner(System.in);
	private int bac;

	public CongNhan(int id, String hoTen, int namSinh, String gioiTinh, String diaChi, int bac) {
		super(id, hoTen, namSinh, gioiTinh, diaChi);
		this.bac = bac;
	}

	public CongNhan() {
		super();
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public void input() {
		super.input(); // kế thừa lại phương thức
		while (bac <= 0 || bac > 7) {
			System.out.print("Nhập vào bậc: ");
			bac = sc.nextInt();
		}
	}

	public void output() {
		super.output();
		System.out.println("Bậc: "+ bac + "/7");
	}
}
