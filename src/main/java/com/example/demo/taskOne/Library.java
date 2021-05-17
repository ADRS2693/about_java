package com.example.demo.taskOne;

public class Library implements AuthorName, AuthorAge, AuthorBook{
     Author[] authors = new Author[5];
    public static void main(String[] args){

    }
    @Override
    public String authorNameSort(String name) {
        String ans = "";
        for (int i =0; i <authors.length; i++){
            if (authors[i].getFirstName().equals(name)){
                return authors[i].getBook();
            }
        }
        return null;
    }

    @Override
    public String authorAgeSort(int age) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getAge() == age) {
                return authors[i].getBook();
            }
        }
        return null;
    }

    @Override
    public String authorBookSort(String book) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getBook() == book) {
                return authors[i].getBook();
            }
        }
        return null;
    }
}

class Author{
    private String firstName;
    private String lastName;
    private String book;
    private int age;

    public Author(String authorFirstName, String authorLastName, String authorBookName, int authorAge){
      firstName = authorFirstName;
      lastName = authorLastName;
      book = authorBookName;
      age = authorAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBook() {
        return book;
    }

    public void setBooks(String books) {
        this.book = books;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface AuthorName{
    String authorNameSort(String name);
}

interface AuthorAge{
    String authorAgeSort(int age);
}

interface AuthorBook{
    String authorBookSort(String book);
}