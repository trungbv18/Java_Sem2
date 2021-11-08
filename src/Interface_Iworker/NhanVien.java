package Interface_Iworker;
import java.util.Date;
import java.util.Scanner;
// import buoi7.Nguoi;

public class NhanVien implements IWorker, IContent {
	private String maNv;
	private String phongBan;
	private int type; // 1: le tan, 2: nv phong ban, 3: bao ve


    public NhanVien() {
    }

    public NhanVien(String maNv, String phongBan, int type) {
        this.maNv = maNv;
        this.phongBan = phongBan;
        this.type = type;
    }
    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
		System.out.println("Ma nv: ");
		this.maNv = sc.nextLine();
		System.out.println("Phong ban: ");
		this.phongBan = sc.nextLine();
		do {
			System.out.println("Vi tri lam viec: ");
			this.type = sc.nextInt();
		}while(this.type != 1 && this.type != 2 && this.type != 3);
	}



    @Override
    public void dongPhuc() {
        // TODO Auto-generated method stub
        // ktra nv vi tri nao -> db -> dong phuc
		switch (this.type) {
		case 1:
		
				System.out.println("Le tan nam thi phai mac vest den");
	
			break;
		case 2:
			System.out.println("Nhan vien phong ban thi mac lich su, tre trung, nang dong.");
			break;
		case 3:
			System.out.println("Bao ve phai mac do bao ho lao dong.");
			break;
		default:
			System.out.println("Khac");
			break;
		}
    }

    @Override
    public void doWork() {
        // TODO Auto-generated method stub
        // ktra nv vi tri nao ->db -> lich cong tac
		// ghi nhan -> db
		if (this.type == 1) {
			System.out.println("Le tan dung lam viec 8h sang -> 17h chieu.");
		} else if (this.type == 2) {
			System.out.println("Nhan vien phai bat dau lam viec tu 8h sang -> 17h chieu.");
		} else if (this.type == 3) {
			System.out.println("Bao ve phai lam viec theo ca");
		} else {
			System.out.println("Khac");
		}
	}
    }   
