package com.study.java_study.ch09_클래스04;

import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;
import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;
    public BookService(){
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }


    private String selecteMenu(){
        String menus = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)){
                break; //selectedMenu가 null이 아니면, 내가 입력한 문자가 menus에 포함되어 있으면 break
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요."); //그렇지 않으면 무한루프
        }

        return selectedMenu;
    }



    public boolean run(){
        //무한루프 횟수 결정
        boolean isRun = true; //while 문이 돌 수 있게 boolean 타입으로 반환

        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록 ");
        System.out.println("2. 도서 검색 ");
        System.out.println("3. 도서 수정 ");
        System.out.println("4. 도서 삭제 ");
        System.out.println("q. 프로그램 종료");

        //메뉴 선택 기능 호출
        String selectedMenu =  selecteMenu();

        switch(selectedMenu){
            case "q":
                isRun = false; // 무한루프 종료
                break;
            case "1":
                registerBook();
                break;
            case "2": search();
                break;
            case "3": midify();
                break;
            case "4": remove();
                break;
            default:
                System.out.println("입력 오류!");

        }
        System.out.println();


        return isRun; //while 문이 돌 수 있게 boolean 타입으로 반환
    }

    private String validateValue(String title){
        String value = null;
        while(true){
            System.out.print(title+"명 입력: ");
            value = scanner.nextLine();

            //isEmpty = " " 도 문자로 포함 isBlank =" "은 공백으로 확인
            if(!value.isBlank()){// 만약에 공백이 아니면 break
                break;
            }
            System.out.println(title+"명은 공백일 수 없습니다. 다시 입력하세요"); //공백이 있으면 무한루프
        }
        return value;
    }

    private String duplicateBookName(){ //중복 체크
        String bookName = null;
        while(true){ // 무한루프
            bookName = validateValue("도서"); // 공백 체크
            if(bookRepository.findBookByBookName(bookName) == null){ // 찾았을때 null이면 없다는 것
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요"); // null이 아니면 책 이름이 중복

        }
        return bookName;
    }


    private void registerBook(){
        System.out.println("[도서 등록]");

        //아래 4줄은 도서 객체 생성을 위해 정보 입력 받는 것
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName(); //중복이 안되는 함수
        String author = validateValue("저자"); // 중복 가능 함수
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId,bookName,author,publisher); // 생성자를 이용하여 객체 생성
        bookRepository.saveBook(book); // 배열의 크기 추가, 저장
        System.out.println("새로운 도서를 등록하였습니다.");
    }


    private void search(){
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.println("옵션 선택: ");
        int option = scanner.nextInt(); //int타입이 아닐 경우 InputMismatchException 예외 발생
        scanner.nextLine(); //nextInt후 나온 enter 버퍼 날려주기
        System.out.print("검색어 입력:");
        String searchText = scanner.nextLine();

        BookEntity[] searchBooks =  bookRepository.searchBooks(option,searchText);
        System.out.println("[ 검색 결과] ");
        if(searchBooks.length == 0){
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks){
            System.out.println(book.toString());
            System.out.println();
        }

    }

    private void remove(){
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.print("삭제할 도서 번호 입력: ");
        int  removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null){
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
    }

    private void midify(){
        System.out.println("[도서 수정]");
        search();
        System.out.println("수정 할 도서번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null){
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        System.out.println("도서 수정 정보 입력 >> ");
        for(int i =0;i<3;i++){
            String selected = null;
            switch (i){
                case 0:
                    System.out.println("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {//equalsIgnoreCase 대소문자 구분 없이 비교
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1:
                    System.out.println("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {//equalsIgnoreCase 대소문자 구분 없이 비교
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.println("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {//equalsIgnoreCase 대소문자 구분 없이 비교
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;
                    }
            }
        }
    }
}
