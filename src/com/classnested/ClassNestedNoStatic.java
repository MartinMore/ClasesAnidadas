
package com.classnested;

public class ClassNestedNoStatic {
    
    private static int campoA;
    
    // Clase Anidada NO ESTATICA
    class InnerClass {
        int campoB;

        public InnerClass() {
            this.campoB = campoA;
        }
        
    }

    public int getCampoA() {
        return campoA;
    }

    public void setCampoA(int campoA) {
        this.campoA = campoA;
    }
    
    public static void main(String[] args) {
        
        // Primero se crea una instancia de la CLASE EXTERNA (OUTEROBJECT)
        ClassNestedNoStatic outerObject = new ClassNestedNoStatic();
        // Creamos el Objecto interno (innerObject)
        ClassNestedNoStatic.InnerClass innerObject = 
                outerObject.new InnerClass();
        
        ClassNestedNoStatic outerObject2 = new ClassNestedNoStatic();
        
        ClassNestedNoStatic.InnerClass innerObject2 = 
                outerObject2.new  InnerClass();
        
        
    }
}
