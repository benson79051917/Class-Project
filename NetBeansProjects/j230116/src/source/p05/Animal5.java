package source.p05;

//  Dog5 is a Animal5 , Cat5 is a Animal5
//  Dog5 has a Tail5 , Beagle5 has a Tail5
//  Beagle5 is a Dog5 , Beagle5 is a Jumper5
public class Animal5 {

}

class Tail5 {
    
}

interface  Juper5 {
    
}

class Dog5 extends Animal5 {
    
    Tail5 tail5;
    
}

class Cat5 extends Animal5 {
    
}

class Beagle5 extends Dog5 implements Juper5 {
    
}