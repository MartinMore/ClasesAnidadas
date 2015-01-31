
package com.classdeclaring;

public class LocalClassExample2 {
    
    static String regularExprecion = "[^0-9]";
    
    public static void validarPhoneNumber (String number1, String number2) {
        
        final int lengthPhone = 10;
        
        class PhoneNumber {
            
            String formatNumber = null;

            public PhoneNumber(String numberPhone) {
                String currentNumber = numberPhone.replaceAll(regularExprecion, "");
                if (currentNumber.length() == lengthPhone) 
                    formatNumber = currentNumber;
            }
            public String getNumber() {
                return formatNumber;
            }
        }
        
        PhoneNumber myNumber1 = new PhoneNumber(number1);
        PhoneNumber myNumber2 = new PhoneNumber(number2);
        
        if(myNumber1.getNumber() == null)
            System.out.println("First number Invalid...!");
        else
            System.out.println("First Number: " + myNumber1.getNumber());
        
        if(myNumber2.getNumber() == null)
            System.out.println("Secund number Invalid...!");
        else
            System.out.println("Secund Number: " + myNumber2.getNumber());
    }
    
    public static void main(String[] args) {
        validarPhoneNumber("1234567890", "421231 23.123");
    }
}
