
package com.classdeclaring;

public class NoCompila {
    
    static String regularExpresion = "[^0-9]";
    
    public static void validateNumber(String number1, String number2) {
        
        final int numberLenght = 10;
        // Invalido en Java SE 7
        // Valido en Java SE 8
        // int numberLenght;
        
        class PhoneNumber {
            // Solo se PERMITE DECLARAR CONSTANTES, por si solo
            // static es invalido !
            // static int num = 3;
            String formatNumber = null;
            public static final String farewel = "Bye bye";
            
            public PhoneNumber(String number) {
                // Para acceder a una variable de la clase envoltoria, para esta
                // clase local, solo podra acceder a campos declarados FINAL
                // numberLenght = 10;
                String currentNumber = number.replaceAll(regularExpresion, "");
                if(currentNumber.length() == numberLenght)
                    formatNumber = currentNumber;
            }

            public String getNumber() {
                return formatNumber;
            }
            
            public void printOriginalsNumbers() {
                // Segunda Restriccion: 
                // Una clase local no puede acceder a los parametros del metodo
                // que lo envuelve, salvo q sean FINAL
                // SOLO A PARTIN DE JAVA SE 8 se permite
                
//                System.out.println("-- number1: " + number1);
//                System.out.println("-- number2: " + number2);
            }
            
            /**
             * NO SE PUEDE DECLARA una INTERFACE dentro de un bloque;
             * pues las INTERFACES son INHERENTEMENTE -- ESTATICAS --
             */
//            interface HelloThere {
//                public void greet ();
//            }
            
            /**
             * Tampoco?.. Tampoco!!, Inicializadores estaticos o 
             * miembros interface son INVALIDOS EN ESTE BLOQUE.
             * 
             * El siguiente metodo NO COMPILA porque se declara STATIC
             * Se dara un error similar: "Modificador estatico solo permitido
             * en declaracion de constantes de variables": 
             */
//            public static void sayGoodBye() {
//                System.out.println("BYE BYE");
//            }
            
        }
        
        PhoneNumber myNumber1 = new PhoneNumber(number1);
        PhoneNumber myNumber2 = new PhoneNumber(number2);
        if (myNumber1.getNumber() == null)
            System.out.println("First Number Invalid...!");
        else
            System.out.println("First Numer: " + myNumber1.getNumber());
        
        if (myNumber2.getNumber() == null)
            System.out.println("Second Number Invalid...!");
        else
            System.out.println("Second Numer: " + myNumber2.getNumber());
    }
    
    public static void main(String[] args) {
        validateNumber("1234567890", "martinmore 0987654321");
    }
    
}
