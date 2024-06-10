package com.study.java_study.ch09_클래스04.연습;

import java.util.Scanner;

public class dircService {

    private Scanner scanner;
    private dircRespository dircRespository;
    public dircService(){
        scanner = new Scanner(System.in);
        dircRespository = new dircRespository();
    }

    private String selecteMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)){
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
        }
        return  selectedMenu;
    }

    public boolean run(){
        boolean isRun = true;

        System.out.println("[ 영어 사전 ]");
        System.out.println("1. 단어 등록");
        System.out.println("2. 단어 검색");
        System.out.println("3. 단어 수정");
        System.out.println("4. 단어 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selecteMenu();

        switch (selectedMenu){
            case "q": isRun = false;
                break;
            case "1":  registerdirc();
                break;
            case "2": search();
                break;
            case "3":
                break;
            case "4":
                break;
            default:System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;
    }

    private String addWord(String title){
        String value = null;
        while(true){
            System.out.println(title+"단어 입력: ");
            value = scanner.nextLine();

            if(!value.isBlank()){
                break;
            }
            System.out.println("단어는 공백일 수 없습니다. 다시 입력하세요");
        }
        return value;
    }

    private String checkWord(){
        String cheakWord = null;
        while(true){
            cheakWord = addWord("영");
            if(dircRespository.findWordByWordName(cheakWord) == null){
                break;
            }
            System.out.println("해당 단어는 이미 존재합니다. 다시 입력하세요");
        }
        return cheakWord;
    }


        private void registerdirc(){
            System.out.println("[단어 등록]");

            int wordNumber = 0;
            String Eword =checkWord();
            String Kword = addWord("한글");

            dircEntity word = new dircEntity(wordNumber,Eword,Kword);
            dircRespository.saveWord(word);
            System.out.println("새로운 단어를 등록하였습니다.");
        }

        private void search(){
            System.out.println("[ 단어 검색 ]");
            System.out.println("1. 통합 검색");
            System.out.println("2. 영단어 검색");
            System.out.println("3. 한글 검색");
            System.out.println("옵션 선택: ");

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.print("검색어 입력: ");
            String searchText = scanner.nextLine();

            dircEntity[] searchWord = dircRespository.searchWords(option,searchText);
            System.out.println("[ 검색 결과 ]");
            if(searchWord.length == 0){
                System.out.println("검색 결과가 없습니다.");
                return;
            }
            for(dircEntity word: searchWord){
                System.out.println(word.toString());
                System.out.println();
            }
        }

}
