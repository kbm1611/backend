package day05;

import java.util.Arrays;

public class Exam1 {

    public static void main(String[] args){
        // [1] 배열이란? *동일한타입*의 여러 자료들을 순서대로 저장하는 자료타입
        // [2] 선언 : 타입[] 변수명 = new 타입 [ 총개수 ];
        // [3] 특징 : (1) 동일한타입끼리 (2) 고정길이 (3) 요소의 초기값 존재
        // [4] 인덱스란? 배열내 요소(값)들이 저장된 순서 번호, 0번 시작
        int[] arr1 = new int[3]; // { 0, 0, 0}
        String[] arr2 = {"봄", "여름", "가을", "겨울"};
        // [5] 배열변수명의 출력
        System.out.println( arr1 ); // [I@4c8770] : 배열의 주소(메모리위치)값 출력 *주소값은 개발자가 제어불가능
        System.out.println( arr2 ); // [Ljava.lang.String:@119]
        // [6] 배열변수의 요소/값 전체 출력, Arrays.toString( 배열변수명 );
        System.out.println(Arrays.toString( arr1 )); // [0, 0, 0]
        System.out.println(Arrays.toString( arr2 )); // [봄, 여름, 가을, 겨율]
        // [*] 배열의 메모리 주소 상태 간단 구조
        /*
        1. new int[3] 선언하면 int[4바이트]   , int[4바이트],    int[4바이트]
        2. 총 4바이트 * 3 => 12바이트 생성한다.
        3. 컴퓨터는 최소의 (윈도우) 저장단위를 바이트( 위치/주소값 )
            -> 12주소값 생성, 101번지 102번지 103번지 104번지 ,201번지 202번지 203번지 204번지
        4. 배열의 변수는 총 12개의 주소값을 가진게 아니고 가장 첫번째의 주소값을 가진다.
            int arr1 = new int[3];
            arr1 = 101번지 : 첫번째 주소밗
        5. 실행중에 개발자가 배열내 주소/메모리 값 삭제 불가능.  vs  JS는 delete 대신 splice
        6. 주소값에 임의의 초기값을 자동으로 들어간다. < G : 쓰레기 C : 수집가, 비어있는 메모리 사젝>
            정수 : 0, 실수 : 0,0, 문자열 : null
        * */
        // [7] 배열 사용
        System.out.println( arr1[0] ); // 배열변수명[인덱스]
        arr2[1] = "spring";
        System.out.println( arr2[1] );
        // [9] 배열의 요소 추가/삭제 없다.
        arr1[4] = 40; //java.lang.ArrayIndexOutofBounding 배열의 크기를 벗어남!

        // [10] 박복문 활용
        for( int index = 0; index <= arr1.length -1 ; index++){  //index는 0부터 마지막인덱스 이하까지 1씩증가한다.
            System.out.println( arr1[index] ); // [index]번째 요소값 가져오기/출력
        }
        // [11] 향상된 for문 : 위와같이 많이 사용되므로 추가된 반복문
//        for( 타입 반복변수 : 배열변수명 ){ },  iterator(이터레이터/반복자/순회자)가 가능한 배열/객체만 사용 가능
        for(int value : arr1 ){
            System.out.println( value );
        }
    }
}
