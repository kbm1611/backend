package day07.practice9;

public class Practice9 {
    public static void main(String[] args) {

        Book book1 = new Book("이것이 자바다", "신용권", 30000);
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);


        Book book2 = new Book("자바의 정석", "남궁성", 28000);
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("사각형의 넓이: " + rectangle.getArea(rectangle.width, rectangle.height));

        BankAccount bankAccount = new BankAccount("111-222-3333", "유재석", 10000);
        bankAccount.deposit(5000);
        bankAccount.withdraw(3000);

        Goods goods1 = new Goods();
        System.out.println(goods1.name);
        System.out.println(goods1.price);

        Goods goods2 = new Goods("콜라", 2000);
        System.out.println(goods2.name);
        System.out.println(goods2.price);

        Member member = new Member();
        System.out.println(member.id);
        System.out.println(member.isLogin);
    }
}
