/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambdaredsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author usuario
 */
public class RedSocial {

    // ENFOQUE 1:::
    // Buscar miembros que concuerden con una caracteristica
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                System.out.println(p);
            }
        }
    }

    // ENFOQUE 2:::
    // METHODO GENERALIZADO.
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if ((low <= p.getAge()) && (p.getAge() <= high)) {
                System.out.println(p);
            }
        }
    }

    // ENFOQUE 3:::
    // LOCAL CLASS
    interface CheckPerson {

        boolean test(Person p);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }

    // ENFOQUE 6:::
    interface Predicate<Person> {

        boolean test(Person t);
    }

    public static void printPersonsWithPredicate(List<Person> roster,
            Predicate<Person> tester) {
        for (Person p : roster) {
            System.out.println(p);
        }
    }

    // ENFOQUE 7:::
    public static void printPersonWithPredicate(List<Person> roster,
            Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Consumer<Person> {

        void accept(Person p);
    }

    // .....................
    public static void processPersons(List<Person> roster,
            Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    // ENFOQUE 7... Ejemplo 2.
//    public static void processPersonsWithFunction(List<Person> roster,
//            Predicate<Person> tester,
//            Function<Person, String> mapper,
//            Consumer<String> block) {
//
//    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("More", 19, new Date(), Person.Sex.MALE, "maore_2332@hotmail.com"));
        person.add(new Person("Martin", 20, new Date(), Person.Sex.MALE, "maore_2332@hotmail.com"));
        person.add(new Person("Jhon", 21, new Date(), Person.Sex.MALE, "maore_2332@hotmail.com"));
        person.add(new Person("Panta", 16, new Date(), Person.Sex.MALE, "maore_2332@hotmail.com"));
        person.add(new Person("Valeria", 15, new Date(), Person.Sex.FEMALE, "xxxxxx@hotmail.com"));
        // ----------------------------------------------------------------------
        // ENFOQUE 1...
        // printPersonsOlderThan(person , 19);
        // ----------------------------------------------------------------------
        // ENFOQUE 2...
        // printPersonsWithinAgeRange(person, 18, 20);
        // ----------------------------------------------------------------------
        // ENFOQUE 3...
        class CheckPersonEligibleForSelectiveService implements CheckPerson {

            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        }
        // printPersons(person, new CheckPersonEligibleForSelectiveService());
        // ----------------------------------------------------------------------
        // ENFOQUE 4...
        // CLASE ANONIMA
//        printPersons(person, new CheckPerson() {
//            @Override
//            public boolean test(Person p) {
//                return p.getGender() == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25;
//            }
//        });

        // ENFOQUE 5...
        // EXPRESION LAMBDA
//        printPersons(person,
//                (Person p) -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25
//        );
        // ENFOQUE 6...
        // USO ESTANDAR FUNCIONAL
        // INTERFACES CON EXPRESIONES LAMBDA
//        printPersonsWithPredicate(person,
//                p -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25
//        );
        // ENFOQUE 7...
//        processPersons(
//                person,
//                p -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25,
//                p -> p.printPerson()
//        );
        // recupera la direccion de correo de c/miembro
        // que figura en person
//        processPersonsWithFunction(person, p -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25,
//                p -> p.getEmailAddress(),
//                email -> System.out.println(email)
//        );
        
        
        

    }
}
