import java.util.Scanner;
public class BookTest {
    public static void main(String[] args) {
        Book one = new Book();
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите жанр книги:");
        one.setGenre(cs.nextLine());
        System.out.println("Введите название книги:");
        one.setName(cs.nextLine());
        System.out.println("Введите автора книги:");
        one.setAuthor(cs.nextLine());
        System.out.println("Введите дату книги:");
        one.setDate(cs.nextLine());
        System.out.println("Информация о книге:\nЖанр книги: "+one.getGenre()+"\nНазвание книги: "+one.getName()+"\nАвтор книги: "+one.getAuthor()+"\nДата книги: "+one.getDate() );
    }
}
