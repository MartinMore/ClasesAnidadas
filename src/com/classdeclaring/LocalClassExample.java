
package com.classdeclaring;

public class LocalClassExample {
    
    static String regularExpression = "[^0-9]";
    
    public static void validatePhoneNumber (String phoneNumber1, String phoneNumber2) {
        final int numberLength = 10;
        
        // ---- CLASE LOCAL ----
        class PhoneNumber {
            
            String formattedPhoneNumber = null;

            public PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if(currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                }
                else {
                    formattedPhoneNumber = null;
                }
            }

            public String getFormattedPhoneNumber() {
                return formattedPhoneNumber;
            }
        }
        
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        
        if(myNumber1.getFormattedPhoneNumber() == null) 
            System.out.println("First Number is invalid! ");
        else
            System.out.println("First Number is: " + myNumber1.getFormattedPhoneNumber());
        
        if(myNumber2.getFormattedPhoneNumber() == null) 
            System.out.println("Second Number is invalid! ");
        else
            System.out.println("Second Number is: " + myNumber2.getFormattedPhoneNumber());
        
    }
    
    public static void main(String[] args) {
        validatePhoneNumber("123123123.", "31 23229213");
    }
    
}
