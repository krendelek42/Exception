import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RecordNotFound, RecordNotValid {
        PhoneBook book = new PhoneBook(new ArrayList<Record>());
        System.out.println("------------------CREATE RECORD ---------------------");
        Record record = new Record(1l, "8 (923) 518 09-32", "Ксения");
        try {
            book.createRecord(record);
        } catch (PhoneNumberAlreadyExists e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------UPDATE RECORD ---------------------");
        record = new Record(1l, "8 (933) 300 69-39", "Маша");
        try {
            book.updateRecord(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------CREATE RECORD ---------------------");
        record = new Record(2l, "8 (923) 518 09-32", "Ксения");
        try {
            book.createRecord(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------DELETE RECORD ---------------------");
        book.deleteRecord(1l);
        System.out.println(book.getAllRecords());
        System.out.println("");
        System.out.println("------------------EXCEPTION ---------------------");
        System.out.println("------------------CREATE RECORD ---------------------");
        try {
            record = new Record(3l, "8 (923) 518 09-32", "Полина");
            book.createRecord(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------UPDATE RECORD (NAME)---------------------");
        record = new Record(2l, "8 (933) 300 69-39", "");
        try {
            book.updateRecord(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------UPDATE RECORD (ID)---------------------");
        try {
            record = new Record(1l, "8 (933) 300 69-39", "Полина");
            book.updateRecord(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());
        System.out.println("------------------DELETE RECORD ---------------------");
        try {
            book.deleteRecord(1l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(book.getAllRecords());

    }
}