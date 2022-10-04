package com.dev.userform.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

public class ErrorResponce {

    @Getter
    @Setter

    private String message;
    private String errorDetails;
    private LocalDate timeStamp;

    public ErrorResponce() {
    }

    public ErrorResponce(String message , String errorDetails){
        super();
        this.message = message;
        this.errorDetails=errorDetails;
        this.message=message;
    }
}
