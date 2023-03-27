package com.example.springbootdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//return to client this response incase of exception
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message){
        super();
    }

}



    //------------------------OTHER WAY TO DO IT WITH ARGURMENTS----------------------------//
//    private String resourceName;
//    private String fieldName;
//    private Object fieldValue;
//
//    public ResourceNotFoundException(String resourceName,String fieldName, Object fieldValue ){
//
//        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
//        this.resourceName=resourceName;
//        this.fieldName=fieldName;
//        this.fieldValue=fieldValue;
//    }
//
//    public String getResourceName(){
//        return resourceName;
//    }
//
//    public String getFieldName() {
//        return fieldName;
//    }
//
//    public Object getFieldValue() {
//        return fieldValue;
//    }

