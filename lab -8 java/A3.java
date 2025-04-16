The Transport interface declares a deliver () method. The abstract class Animal is the 
super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
implemented by the Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects.If the object implements the Transport interface, the 
deliver () method is invoked.

interface Transport{
    void deliver(){}
}

abstract class Animal extends Transport{
    int[] Animal= new int[4];
}

abstract class Tiger extends Animal{

}
abstract class Tiger extends Camel{
    
}
abstract class Tiger extends Donkey{
    
}



public class A3{
    public static void main(String[] args){

         Animal a1=new Animal();
    }
}