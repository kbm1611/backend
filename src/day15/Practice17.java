package day15;

import java.util.*;

public class Practice17 {
    public static void main(String[] args) {
        //문제1
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        box1.content = "안녕하세요";
        System.out.println("box1.content = " + box1.content);
        box2.content = 100;
        System.out.println("box2.content = " + box2.content);

        //문제2
        List<String> list = new ArrayList<>();
        list.add("유재석"); list.add("강호동");
        list.add("서장훈"); list.add("신동엽");
        list.add("유재석");
        System.out.println( "[contains]" + list.contains("서장훈") );
        System.out.println( "[indexOf]" + list.indexOf("서장훈") );
        list.remove("서장훈");
        System.out.println( "[삭제후]" + list );

        //문제3
        int[] draw = {1,3,3,7,9,9,2,10,10,8,4,4,6,6,5};

        Set<Integer> lottoSet = new HashSet<>();
        for(int num : draw){
            lottoSet.add(num);
        }
        System.out.println("[추첨결과]" + lottoSet);
        System.out.println("[개수]" + lottoSet.size() );
        System.out.println("[contains 7]" + lottoSet.contains(7) );

        //문제4
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll( lottoSet ); //다른 집합의 요소들을 새로운 요소에 대입 .addAll( 집합객체 )
        System.out.println("[정렬된 추첨번호]" + treeSet.descendingSet() ); // .descendingSet() : 내림차순

        //문제5
        Map<String, Integer> map = new Hashtable<>();
        map.put("유재석", 95); map.put("강호동", 100);
        map.put("신동엽", 78); map.put("유재석", 67);
        map.put("서장훈", 100);
        System.out.println("[get유재석]" + map.get("유재석"));
        System.out.println("[size]" + map.size() );
        map.remove("유재석");
        System.out.println("[remove 후 map]" + map);

        //문제6
        System.out.println( "[containsKey 강호동]" + map.containsKey( "강호동" ) );
        System.out.println( "[containsValue 65]" + map.containsValue(65) );
        System.out.println( "[all]" );
        map.keySet().forEach((key) -> {
            Integer value = map.get(key);
            System.out.println( key + "=" + value );
        });

        //문제7
        String json = "{\"name\":\"유재석\",\"age\":45,\"city\":\"서울\"}";
        Map<String, String> jsonmap = new HashMap<>();
        System.out.println(json);
        json = json.replace("{", "");
        json = json.replace("}", "");
        System.out.println(json);
        String[] jsonAry = json.split(",");
        for(int i = 0; i <= jsonAry.length-1; i++){
            String[] keyValue = jsonAry[i].split(":");
            jsonmap.put( keyValue[0], keyValue[1]);
        }
        System.out.println( "[name]" + jsonmap.get("name") );
        System.out.println( "[age]" + jsonmap.get("age") );
        System.out.println( "[all]" );
        jsonmap.keySet().forEach((key) -> {
            String value = jsonmap.get(key);
            System.out.println( key + "=" + value );
        });

        //문제8
        Map<String, Object> stock1 = new HashMap<>();
        stock1.put("name", "삼성전자");
        stock1.put("price", 72000);
        stock1.put("volume", 1500000);

        Map<String, Object> stock2 = new HashMap<>();
        stock2.put("name", "카카오");
        stock2.put("price", 52000);
        stock2.put("volume", 800000);

        Map<String, Object> stock3 = new HashMap<>();
        stock3.put("name", "네이버");
        stock3.put("price", 210000);
        stock3.put("volume", 300000);

        ArrayList<Map<String, Object> > stockList = new ArrayList<>();
        stockList.add(stock1);
        stockList.add(stock2);
        stockList.add(stock3);

        System.out.println(stockList);
        stockList.forEach( (stock) -> {
            System.out.printf("종목명:%s/가격:%d/거래량:%d\n", stock.get("name"), stock.get("price"), stock.get("volume"));
        });

    }
}
class Box<T>{
    public T content;
}
class StockDto{
    String name;
    int price;
    int volume;
}
