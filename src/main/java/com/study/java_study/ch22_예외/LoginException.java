package com.study.java_study.ch22_예외;

import lombok.Data;

@Data

public class LoginException extends  RuntimeException{
    private String username;

    public LoginException(String userName) {
        this.username = userName;
    }

    public LoginException(String message, String userName) {
        super(message);
        this.username = userName;
    }
    public String getErrorMessage(){
        return username+"사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }


}
