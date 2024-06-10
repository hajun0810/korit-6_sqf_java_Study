package com.study.java_study.ch09_클래스04;


// 저장소 -> CRUD
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0]; // 크기가 0 인 배열을 하나 생성
    }

    public int autoIncrementBookId(){ // bookId를 만드는 함수
        return ++bookId; // 호출시마다 1씩 증가
    }

    private void extendBooks() {
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }

    private int getLastIndex(){
        //배열의 마지막 공간을 리턴한다.
        return books.length-1;
    }

    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    //단건 조회
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;

        // 선형탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }
    //단건 조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        // 선형탐색
        for (BookEntity book : books) { // for each로 반복
            if (book.getBookName().equals(bookName)) { // 이름이 중복되는 지 확인
                findBook = book;
                break;
            }
        }

        return findBook; // 찾지 못했으면 null
    }

    private int getNewArraySize(int option ,String searchText) {
        int newArraySize = 0;

        //contains 포함 되어 있는지 확인 "가나다" 이면 "가"만 입력 받아도 참

        switch (option){
            case 1: //통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: //도서명
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: //저자명
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: //출판사명
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }

        }

        return newArraySize;
    }

    //다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option,searchText);
        BookEntity [] searchBooks = new BookEntity[newArraySize]; // 새 배열 생성

        int i = 0;
        switch (option){
            case 1: //통합검색
                for(BookEntity book : books) { // 새 배열에 내가 찾는  정보 입력
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: //도서명
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: //저자명
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: //출판사명
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }

        }

        return searchBooks;
    }

    private int indexOfBookId(int bookId){ // id로 인덱스 찾는 함수
        int findIndex = -1;
        for(int i=0;i<books.length;i++){
            if(books[i].getBookId() == bookId){
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }



    public void deleteBookByBookId(int bookId){ //도서 아이디로 도서 삭제 함수
        int findIndex = indexOfBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length-1];

        for(int i=-0;i<newBooks.length;i++){
            if(i<findIndex){
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i+1];
        }
        books = newBooks;
    }

}











