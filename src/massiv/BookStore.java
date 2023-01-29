package massiv;

public class BookStore {
    public static void main(String[] args) {

        Book[] bookList = new Book[99];

        Book book1 = new Book();
        book1.bookName = "The Hobbit";
        book1.bookPrice = 999;
        book1.editionYear = 1937;

        addBook(bookList, book1);

        Book book2 = new Book();
        book2.bookName = "The Hobbit 2";
        book2.bookPrice = 999;
        book2.editionYear = 1939;

        addBook(bookList, book2);
        printAllBookList(bookList);

    }

    public static boolean checkBook(Book[] bookList, Book book) {

        for (Book item: bookList) {


            if (item != null && item.bookName.equals(book.bookName) && item.editionYear == book.editionYear) {

                System.out.println("Данная книга уже есть в картотеке");
                return true;
            }
        }

        System.out.println("Данной книги нет в картотеке");
        return false;
    }

    public static void addBook(Book[] bookList, Book book) {

        if (!checkBook(bookList, book)) {

            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] == null) {
                    bookList[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == bookList.length - 1) {
                    System.out.println("Картотека переволнена");
                }
            }

        }

    }

    public static void printAllBookList(Book[] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, bookList[i].bookName, bookList[i].editionYear, bookList[i].bookPrice);
            }
        }
    }

}
/*Написать программу «Книжный магазин», расположенную в специальном пакете.

В программе создать класс «книга», состояние которого описывается параметрами: «название книги» (строковый), «цена» (целочисленный), «дата издания» (целочисленный).

В основном классе создать «картотеку книг», представленную массивом «книг».

В основном или отдельном классе создать статический метод/методы, который будет осуществлять проверку по параметрам «название книги» и «год выпуска». Есть ли такая книга в картотеке: если есть — выдавать соответствующее сообщение), если нет — добавлять книгу в картотеку (выдавать сообщения о добавлении книги).

Если массив (картотека) заполнен — выдавать сообщение об этом.

Проверку строчных параметров («название книги») можно организовать встроенным методом String equals.

⭐ Добавить метод, который выводит в консоль (на печать) всю информацию о всех книгах (название, год издания, цену) без конкатенации, при помощи форматирования.*/