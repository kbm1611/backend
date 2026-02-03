package 종합.과제3.database;

import day07.package1.A;
import 종합.과제3.model.dto.BookDto;
import 종합.과제3.model.dto.RentBookDto;
import 종합.과제3.model.dto.UserDto;

import java.util.ArrayList;

public class DB {
    public static ArrayList<UserDto> users = new ArrayList<>();
    public static ArrayList<BookDto> books = new ArrayList<>();
    public static ArrayList<RentBookDto> rentbooklist = new ArrayList<>();

    public static int currentUid = 0;
    public static int currentbid = 0;
    public static int currentRid = 0;
}
