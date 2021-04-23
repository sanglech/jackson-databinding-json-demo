package com.christian.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

    public static void main (String[] args){

        try{
            //Create object mapper using jackson
            ObjectMapper mapper = new ObjectMapper();

            //read json file and convert to pojo
            
            Student theStudent=mapper.readValue(new File("data/sample-full.json"),Student.class);

            //print first name and last name
            System.out.println("Student First name: "+ theStudent.getFirstName());
            System.out.println("Student Last name: "+ theStudent.getLastName());
            
            //print out address
            Address tempAddress= theStudent.getAddress();
            
            System.out.println("The street: "+ tempAddress.getStreet());
            System.out.println("The city: "+ tempAddress.getCity());
            
            //print out languages
            for(String tempLang: theStudent.getLanguages()) {
            	System.out.println("Languages: "+ tempLang);
            }
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
