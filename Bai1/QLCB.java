import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<CongNhan> listCN = new ArrayList<>();
	private static ArrayList<KySu> listKS = new ArrayList<>();
	private static ArrayList<NhanVien> listNV = new ArrayList<>();

	public static void main(String[] args) {
		int choose;
		do {
			System.out.println("-----------Menu-----------\n" + "1: Add 1 cán bộ vào List tương ứng\r\n"
					+ "2: Hiển thị danh sách các cán bộ\r\n" + "3: Xóa 1 cán bộ theo id\r\n"
					+ "4: Tìm kiếm 1 cán bộ theo id\r\n" + "5: Dừng chương trình\r\n");
			System.out.print("Mời nhập vào lựa chọn: ");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				add();
				break;
			}
			case 2: {
				System.out.println("Danh sách cán bộ ");
				hienThi();
				break;
			}
			case 3: {
				xoaCb();
				break;
			}
			case 4: {
				timKiem();
				break;
			}
			}
		} while (choose != 5);
	}

	public static void add() {
		int choose1;
		do {
			System.out.println("Bạn muốn thêm cán bộ chức vụ nào:" + "\n1.Công nhân" + "\n2.Kỹ sư" + "\n3.Nhân viên");
			choose1 = sc.nextInt();
			switch (choose1) {
			case 1: {
				CongNhan cn = new CongNhan();
				cn.input();
				for (int i = 0; i < listCN.size(); i++) {
					while (listCN.get(i).getId() == cn.getId()) {
						System.out.println("Id bị trùng, mời nhập lại: ");
						cn.setId(sc.nextInt());
					}
				}
				listCN.add(cn);
				break;
			}

			case 2: {
				KySu ks = new KySu();
				ks.input();
				for (int i = 0; i < listKS.size(); i++) {
					while (listKS.get(i).getId() == ks.getId()) {
						System.out.println("Id bị trùng, mời nhập lại: ");
						ks.setId(sc.nextInt());
					}
				}
				listKS.add(ks);
				break;
			}

			case 3: {
				NhanVien nv = new NhanVien();
				nv.input();
				for (int i = 0; i < listNV.size(); i++) {
					while (listNV.get(i).getId() == nv.getId()) {
						System.out.println("Id bị trùng, mời nhập lại: ");
						nv.setId(sc.nextInt());
					}
				}
				listNV.add(nv);
				break;
			}
			}
		} while (choose1 <= 0 || choose1 > 3);

	}

	public static void hienThi() {

		System.out.println("--Danh sách công nhân: ");
		if (listCN.isEmpty())
			System.out.println("Trống");
		else {

			for (int i = 0; i < listCN.size(); i++) {
				listCN.get(i).output();
			}
		}
		System.out.println("--Danh sách kỹ sư: ");
		if (listKS.isEmpty())
			System.out.println("Trống");
		else {

			for (int i = 0; i < listKS.size(); i++) {
				listKS.get(i).output();
			}
		}

		System.out.println("--Danh sách nhân viên: ");
		if (listNV.isEmpty())
			System.out.println("Trống");
		else {

			for (int i = 0; i < listNV.size(); i++) {
				listNV.get(i).output();
			}
		}

	}

	public static void xoaCb() {
		int choose1;
		do {
			System.out.println("Bạn muốn xóa cán bộ chức vụ nào:" + "\n1.Công nhân" + "\n2.Kỹ sư" + "\n3.Nhân viên");
			choose1 = sc.nextInt();
			switch (choose1) {
			case 1: {
				int count = 0;
				System.out.println("Nhập id công nhân bạn muốn xóa: ");
				int id = sc.nextInt();
				for (int i = 0; i < listCN.size(); i++) {
					if (id == listCN.get(i).getId()) {
						listCN.remove(i);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Id không hợp lệ!");
				} else {
					System.out.println("Danh sách cán bộ sau khi xóa: ");
					hienThi();
				}
				break;
			}

			case 2: {
				int count = 0;
				System.out.println("Nhập id kỹ sư bạn muốn xóa: ");
				int id = sc.nextInt();
				for (int i = 0; i < listKS.size(); i++) {
					if (id == listKS.get(i).getId()) {
						listKS.remove(i);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Id không hợp lệ!");
				} else {
					hienThi();
				}
				break;
			}

			case 3: {
				int count = 0;
				System.out.println("Nhập id nhân viên bạn muốn xóa: ");
				int id = sc.nextInt();
				for (int i = 0; i < listNV.size(); i++) {
					if (id == listNV.get(i).getId()) {
						listNV.remove(i);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("Id không hợp lệ!");
				} else {
					hienThi();
				}
				break;
			}
			}
		} while (choose1 <= 0 || choose1 > 3);
	}

	public static void timKiem() {
		System.out.print("Moi nhap id can bo ban muon tim: ");
		int id = sc.nextInt();
		int count = 0;
		for (int i = 0; i < listCN.size(); i++) {
			if (listCN.get(i).getId() == id) {
				count++;
				System.out.println("Thông tin cán bộ bạn muốn tìm: ");
				listCN.get(i).output();
			}
		}
		for (int i = 0; i < listKS.size(); i++) {
			if (listKS.get(i).getId() == id) {
				count++;
				System.out.println("Thông tin cán bộ bạn muốn tìm: ");
				listKS.get(i).output();
			}
		}
		for (int i = 0; i < listNV.size(); i++) {
			if (listNV.get(i).getId() == id) {
				count++;
				System.out.println("Thông tin cán bộ bạn muốn tìm: ");
				listNV.get(i).output();
			}
		}
		if (count == 0) {
			System.out.println("Id không hợp lệ!");
		}
	}
}
