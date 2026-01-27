package day05;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //문제1
        Book book1 = new Book();

        book1.title = "이것이 자바다";
        System.out.println("book1.title = " + book1.title);
        book1.author = "신용권";
        System.out.println("book1.author = " + book1.author);
        book1.price = 30000;
        System.out.println("book1.price = " + book1.price);

        Book book2 = new Book();
        book2.title = "자바의 정석";
        System.out.println("book2.title = " + book2.title);
        book2.author = "남궁성";
        System.out.println("book2.author = " + book2.author);
        book2.price = 28000;
        System.out.println("book2.price = " + book2.price);

        //문제2
        Pet pet1 = new Pet();
        pet1.name = "초코";
        System.out.println("pet1.name = " + pet1.name);
        pet1.species = "푸들";
        System.out.println("pet1.species = " + pet1.species);
        pet1.age = 3;
        System.out.println("pet1.age = " + pet1.age);

        Pet pet2 = new Pet();
        pet2.name = "나비";
        System.out.println("pet2.name = " + pet2.name);
        pet2.species = "코리안숏헤어";
        System.out.println("pet2.species = " + pet2.species);
        pet2.age = 5;
        System.out.println("pet2.age = " + pet2.age);

        //문제3
        Rectangle rec1 = new Rectangle();
        rec1.width = 10;
        rec1.height = 5;
        System.out.println("사각형의 넓이: " + rec1.width * rec1.height);

        //문제4
        BankAccount bank1 = new BankAccount();
        bank1.accountNumber = "111-222-3333";
        bank1.ownerName = "유재석";
        bank1.balance = 10000;

        bank1.balance += 5000;
        System.out.println("입금 후 잔액: " + bank1.balance);
        bank1.balance -= 3000;
        System.out.println("입금 후 잔액: " + bank1.balance);

        //문제5
        Product product1 = new Product();
        product1.name = "새우깡";
        product1.price = 1500;

        Product product2 = new Product();
        product2.name = "콜라";
        product2.price = 2000;

        if(product1.price >= product2.price){
            System.out.println("product1.name = " + product1.name);
        }else{
            System.out.println("product2.name = " + product2.name);
        }

        //문세6
        Member member = new Member();
        member.id = "admin";
        member.isLogin = false;
        System.out.println("로그인 전 상태: " + member.isLogin);
        member.isLogin = true;
        System.out.println("로그인 후 상태: " + member.isLogin);

        //문제7
        Television tele = new Television();
        tele.channel = 7;
        tele.volume = 20;

        tele.channel = 11;
        tele.volume = 20 - 2;
        System.out.println("tele.channel = " + tele.channel);
        System.out.println("tele.volume = " + tele.volume);

        //문제8
        //클래스명은 무조건 첫글자 대문자로 시작한다.
        // 클래스(객체 표현한 설계도|논리적)
        // vs 객체( 속성과기능 갖는 대상 ) -> 좀 더 추상적인 개념(객체를 다루기 위해서는 클래스를 만들고 사용하기 위해서는 인스턴스로 만드는 것)
        // vs 인스턴스( 클래스 기반으로 물리적 생성), new 인스턴스화 키워드 메모리 생성되면서 주소값을 갖는다.
        // 생성된 객체는 변수에 저장하지 않으면 일정시간이 지나면 GC(쓰레기 수집기)가 삭제한다.
        Player player1 = new Player();
        player1.name = "손흥민";
        player1.power = 90;
        player1.speead = 95;

        Player player2 = new Player();
        player2.name = "이강인";
        player2.power = 85;
        player2.speead = 92;

        if( (player2.power + player2.speead) <= (player1.power + player1.speead) ){
            System.out.println("player1.name = " + player1.name);
        }

        //문제9
        MenuItem menu1 = new MenuItem();
        menu1.name = "김치찌개"; menu1.price = 8000; menu1.isSignature = true;

        MenuItem menu2 = new MenuItem();
        menu2.name = "된장찌개"; menu2.price = 8000; menu2.isSignature = false;

        MenuItem menu3 = new MenuItem();
        menu3.name = "계란찜"; menu3.price = 3000; menu3.isSignature = true;

        MenuItem[] menuList = { menu1, menu2, menu3 };
        for(int i = 0; i <= menuList.length-1; i++){
            if(menuList[i].isSignature){
                System.out.printf("[대표메뉴]%s:%d원\n", menuList[i].name, menuList[i].price);
                break;
            }
        }

        //문제10
        Scanner scan = new Scanner(System.in);
        UserProfile userprofile = new UserProfile();
        System.out.print("이름:");
        userprofile.name = scan.next();
        System.out.print("나이:");
        userprofile.age = scan.nextInt();
        System.out.print("MBTI:");
        userprofile.mbti = scan.next();

        System.out.println("ㅡㅡㅡ프로필ㅡㅡ");
        System.out.println("이름:" + userprofile.name);
        System.out.println("나이:" + userprofile.age);
        System.out.println("MBTI:" + userprofile.mbti);

    }
}
/*[실습] * 제출용 */

/*[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Book 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
3. 두 객체의 모든 정보를 각각 출력하세요.*/


/*[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
1. main 함수에서 Pet 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.*/


/*[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.*/

/*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/


/*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/

/*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/

/*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/

/*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
1. main 함수에서 Player 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/

/*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/

/*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
1. main 함수에서 UserProfile 객체를 하나 생성하세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/


