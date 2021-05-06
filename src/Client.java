public class Client {
    public static void main(String[] args) {
        Observer phone = new PhoneNotification();
        Observer email = new EmailNotification();
        Observer app = new AppNotification();
        Account hai = new Account("Hai");
        Account hoang = new Account("Hoang");
        hoang.add(email);
        Account cong = new Account("Cong");
        cong.add(email);

        hai.add(phone);
        hai.add(email);
        hai.notification("Chuyen cho anh Hoang 500$", hoang);

        System.out.println(".....");

        hai.delete(phone);
        hai.notification("Chuyen cho Cong 400$", cong);

        System.out.println("----");
        hai.add(phone);
        hai.add(app);
        hai.notification("Nhan dc tu anh Hoàng 300$", hoang);
    }
}