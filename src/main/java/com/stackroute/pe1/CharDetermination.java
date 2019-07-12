package com.stackroute.pe1;



public class CharDetermination {
    public String letterDetermination(char input){
        String letterType = "";
        
        if (input>=65 && input<=90){
            letterType = "Capital letter";
        }

        else if (input>=97 && input<=122){
            letterType = "Lowercase letter";
        }

        else if (input>=47 && input<=57){
            letterType = "Digit";
        }

        else if (input>=0 && input>=47 || input>=54 && input<=64 || input>=91 && input<=96
                || input>=123 && input<=127){
            letterType = "Special symbol";
        }
        return letterType;
    }
}

