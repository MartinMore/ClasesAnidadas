
package com.classdeclaring;

public class AnonymousClassesHelloWorld {
    
    private int numGlobal = 300;
    
    interface HelloWorld {
        public void greed();
        public void greetSomeone(String someone);
    }
    
    public void sayHello() {
        
        int numLocalMetodo = 100;
        final int numLocalMetodoFinal = 93;
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            @Override
            public void greed() {
                greetSomeone("world");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new HelloWorld () {
            // Una clase anonima tiene acceso a los miembros
            // de su clase envolvente
            int numLocalAnonymous = numGlobal;
            
            String name = "tout le monde";
            
            /**
             * 1° Restriccion. Al igual q con las clases locales,
             *  no se puede declarar INICIALIZADORES ESTATICOS O INTERFACES
             */
//            public static void sayHello() {
//                System.out.println("Hellooo..");
//            }
//            interface myInterface {}
            
            /*
                Se puede declarar lo siguiente:
                1.- Campos
                2.- Metodos adicionales
                3.- Inicializadores de instancia
                4.- Clases Locales
                NO SE PUEDE DECLARAR: Constructores
            */
            
            public void methodPrueba(String name) {
                /**
                 * Del mismo modo que para las clases locales, NO PUEDE
                 * ACCEDER a las variables localese en su ambito QUE NO
                 * SE DECLARE FINAL...! como numLocalMeotodo
                 */
//                numLocalAnonymous = numLocalMetodo;   // Error... !!
                numLocalAnonymous = numLocalMetodoFinal;
                System.out.println("name param: " + name);
                System.out.println("name campo: " + this.name);
            }
            @Override
            public void greed() {
                greetSomeone("tout le monde");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            @Override
            public void greed() {
                greetSomeone("mundo");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        englishGreeting.greed();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greed();
    }
    
    public static void main(String[] args) {
        AnonymousClassesHelloWorld myApp = 
                new AnonymousClassesHelloWorld();
        myApp.sayHello();
    }
    
}
