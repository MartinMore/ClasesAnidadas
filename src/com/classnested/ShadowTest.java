
package com.classnested;

public class ShadowTest {
    
    public int x = 0;
    
    class FirstLevel {
        
        public int x = 1;
        
        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = "
                                + ShadowTest.this.x);
        }
    }
    
    public static void main(String[] args) {
        // Creamos una instancia de la clase exterior
        ShadowTest st = new ShadowTest();
        // Creamos un objecto de la inner clase (FirstLevel)
        // Mediante la instancia de la clase exterior st
        ShadowTest.FirstLevel fl = 
                st.new FirstLevel();
        // Invocamos el metodo methodInFirstLevel(int x)
        fl.methodInFirstLevel(23);
        
        System.out.println("--------------------");
        ShadowTest st2 = new ShadowTest();
        ShadowTest.FirstLevel fl2 = 
                st2.new FirstLevel();
        fl2.methodInFirstLevel(93);
        
    }
    
}
