package org.example;
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2=new Car();
        car.start();
        car.speed=10;
        System.out.println("speed="+car.speed(car.speed));
        System.out.println("speed2="+car.speed(20));

        Person person=new Person();
        person.introducesPerson("Julia", 21);
        Person person2=new Person();
        person.introducesPerson("aja", 13);

        Book book=new Book("title1","author","332");
        Book book1= new Book("title2","author2","111");
        Book books []={book,book1};
        Library library=new Library(books);

        System.out.println(library.toString());
    }
}