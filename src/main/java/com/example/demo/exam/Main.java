package com.example.demo.exam;

public class Main {
    public static void main(String[] args) {
        String fullNameAidar = "Мусаев Айдар Нурсултанович";
        String fullNameMaksat = "Азамат уулу Максат";
        String  fullNameElina = "Азамат кызы Элина";

        String lastName = "";
        String firstName= "";

            if(firstName.split("\\w+").length>1){

                lastName = firstName.substring(firstName.lastIndexOf(" ")+1);
                firstName = firstName.substring(0, firstName.lastIndexOf(' '));
            }
            else{
                firstName = firstName;
            }
        }
}
