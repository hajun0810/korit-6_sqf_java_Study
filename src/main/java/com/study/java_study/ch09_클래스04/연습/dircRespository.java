package com.study.java_study.ch09_클래스04.연습;

public class dircRespository {
    private dircEntity[] words;


    public dircRespository(){
        words = new dircEntity[0];
    }

    public dircEntity findWordByWordName(String Word) {
        dircEntity cheakWord = null;
        for (dircEntity dirc1 : words) {
            if (dirc1.getEword().equals(Word)) {
                cheakWord = dirc1;
                break;
            }
        }
        return cheakWord;
    }

    private void extendDirc(){
        dircEntity[] newDirc = new dircEntity[words.length+1];

        for(int i=0;i< words.length;i++){
            newDirc[i] = words[i];
        }
        words = newDirc;
    }

    private int getLastIndex(){
        return words.length-1;
    }


    public void saveWord(dircEntity word){
        extendDirc();

        words[getLastIndex()] = word;
    }

    private int getNewArraySize(int option,String searchText){
        int newArraySize = 0;

        switch (option){
            case 1:
                for(dircEntity word : words){
                    if(word.getEword().contains(searchText)
                        || word.getKword().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;
            case 2:
                for(dircEntity word : words){
                    if(word.getEword().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;
            case 3:
                for(dircEntity word : words){
                    if(word.getKword().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;

        }
        return newArraySize;
    }

    public dircEntity[] searchWords(int option,String searchText){
        int newArraySize = getNewArraySize(option,searchText);
        dircEntity [] searchWords = new dircEntity[newArraySize];

        int i =0;
        switch (option){
            case 1:
                for(dircEntity word : words){
                    if(word.getEword().contains(searchText)
                            || word.getKword().contains(searchText)){
                        searchWords[i] = word;
                        i++;
                    }
                }
                break;
            case 2:
                for(dircEntity word : words){
                    if(word.getEword().contains(searchText)){
                        searchWords[i] = word;
                        i++;
                    }
                }
                break;
            case 3:
                for(dircEntity word : words){
                    if(word.getKword().contains(searchText)){
                        searchWords[i] = word;
                        i++;
                    }
                }
                break;

        }
        return searchWords;
    }

}
