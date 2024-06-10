package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            프로그램시작
            도서명: 도서1
            저자명: 저자1
            new Book("도서1","저자1")
            BookList에 추가
            도서명: 도서2
            저자명: 저자2
            new Book("도서2","저자2")
            BookList에 추가
            도서명: 도서3
            저자명: 저자3
            new Book("도서3","저자3")
            BookList에 추가

            도서전체 조회 (toString 출력 X)
            도서명 >> 도서1 ~3
            저자명 >> 저자1 ~3

            삭제할 도서명 :  도서2

            도서명 >> 도서1, 3
            저자명 >> 저자1, 3
         */

        List<Book> books = new ArrayList<>();

        for(int i=0;i<3;i++){
            String bookName;
            String author;
            System.out.println("도서명:");
            bookName = sc.nextLine();
            System.out.println("저자명:");
            author = sc.nextLine();

            books.add(new Book(bookName,author));
        }

        for(Book book : books){
            System.out.println("도서명 : "+book.getBookName());
            System.out.println("저자명 : "+ book.getAuthor());
        }


        System.out.println("삭제할 도서명");
        String removeBookname = sc.nextLine();

        for(Book book : books){ // 도서명을 이용하여 삭제
            if(book.getBookName().equals(removeBookname)){
                books.remove(book);
                break; // 더이상 반복이 돌지 않게 탈출
            }
        }

        for(int i=0;i<books.size();i++){ //도서의 인덱스를 이용하여 삭제
            if(books.get(i).getBookName().equals(removeBookname)){
                Book removeBook = books.remove(i);
                System.out.println("삭제된 도서 정보 "+ removeBook);
                break;
            }
        }

        for(int i=0;i<books.size();i++){
            System.out.println("도서명 : "+ books.get(i).getBookName());
            System.out.println("저자명 : "+books.get(i).getAuthor());
        }

    }
}
