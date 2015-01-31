
package com.classnested;

public class ClassNestedStatic {
    
    // Clase Anidada Estatica
    static class StaticNestedClass {
        
    }
    
    /*
        Clase Anidada NO ESTATICA o
        inner class
    */
    class InnerClass {
        
    }
    
    public static void main(String[] args) {
        // Forma de accedes a una clase ANIDAD ESTATICA
        ClassNestedStatic.StaticNestedClass
                nestedObject = new ClassNestedStatic.StaticNestedClass();
        
    }
    
}
