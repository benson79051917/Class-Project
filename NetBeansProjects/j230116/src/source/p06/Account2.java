package source.p06;

public class Account2 {

    private String 帳號;    //  存放帳號
    private int 存款餘額;   //  存簿餘額    

    public void 存款(int 存款) { // 存款

        
        if (!檢核存款(存款)) {
            System.out.println("Error !");
            return;
        }
        存款餘額 += 存款;
        秀金額();
    }

    public void 提款(int 提款) { // 提款

        
        if (!檢核提款(提款)) {
            System.out.println("Error !");
            return;
        }
        存款餘額 -= 提款;
        秀金額();
    }

    public void 設定資料(String id, int money) {// 設定資料

        帳號 = id;
        存款餘額 = money;
        秀金額();
    }

    public boolean 檢核存款(int 存款) {

        if (存款 > 50000) {
            return false;
        }
        return true;

    }

    public boolean 檢核提款(int 提款) {
        if (提款 > 存款餘額) {
            return false;
        }
        return true;
    }

    public void 轉帳(int 轉帳) {
        if (!檢核提款(轉帳)) {
            System.out.println("Error !");
        }else {
            存款餘額 -= 轉帳;
            System.out.println("餘額 : " +存款餘額 );
        }
    }

    public void 秀金額() { //  顯示餘額

        System.out.println(" 帳號 : " + 帳號);
        System.out.println(" 餘額 : " + 存款餘額);
    }
}
