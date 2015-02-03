
package com.classnested;

public class ClassNestedStatic {
    
    private static int numA = 20;
    // Clase Anidada Estatica
    static class StaticNestedClass {
        int numB;

        public StaticNestedClass() {
            numB = numA;
        }
    }
    
    /*
        Clase Anidada NO ESTATICA o
        inner class
    */
    class InnerClass {
        // Invalido, solo constantes
        // static int numZ = 20;
        int numC = numA;
    }
    
    public static void main(String[] args) {
        // Forma de accedes a una clase ANIDAD ESTATICA
        ClassNestedStatic.StaticNestedClass
                nestedObject = new ClassNestedStatic.StaticNestedClass();
        
    }
    
}
