
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	private static int n;
	private static PhuongTien[] pt ;
	private static boolean check = false;
	public static void main(String[] args) {
		
		String choose;
		
		do {
			System.out.println("-----------Menu-----------\n" + "a. Nhập thông tin và tạo danh sách các xe \r\n"
					+ "b. Xuất bảng kê khai tiền thuế trước bạ của các xe. \r\n"
					+ "c. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần\r\n"
					+ "d. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\r\n" + "e. Thoát.\r\n"
					+ "");

			System.out.println("Nhập vào lựa chọn a-e: ");
			choose = sc.nextLine();
			switch (choose) {
			case "a": {
				input1();
				break;
			}
			case "b": {
				System.out.println("Bảng kê khai tiền thuế trước bạ của các xe: ");
				output1();
				break;
			}
			case "c": {
				output2();
				break;
			}
			case "d": {
				output3();
				break;
			}
			case "e": {
				System.out.println("Thoát chương trình!");
				return;

			}
			default:{
				  System.out.println("Khong co chuc nang nay ");
                  break;
			}
			}

		} while (true);
	}
	public static void input1() {
		 do{
		System.out.println("Nhập số lượng xe: ");
		n = sc.nextInt();
		}while(n<=0);
		 pt = new PhuongTien[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Nhập thông tin xe thứ "+(i+1));
			pt[i]= new PhuongTien();
			pt[i].input();;
			
		}
//		check = true;
	}
	public static void output1() {
	            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
	            for(int i = 0; i < n; i++){
	                pt[i].output();
	            }
	        }
	public static void output2() {
		System.out.println("Bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần: ");
	            PhuongTien tg;
	            for(int i = 0; i < n-1; i++){
	                for(int j = i+1; j <n; j++){
	                    if(pt[i].getThuePhaiNop() < pt[j].getThuePhaiNop()){
	                        tg = pt[i];
	                        pt[i]=pt[j];
	                        pt[j]=tg;
	                    }
	                }
	            }
	            output1();
	            
	        }
	public static void output3() {
		System.out.println("Bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần: ");
		PhuongTien tg;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j <n; j++){
                if(pt[i].getTriGia() > pt[j].getTriGia()){
                    tg = pt[i];
                    pt[i]=pt[j];
                    pt[j]=tg;
                }
            }
        }
        output1();
        
	}
}
