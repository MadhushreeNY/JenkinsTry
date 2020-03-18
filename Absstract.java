import java.io.*;
abstract class A{
 abstract void callme();}
abstract class B extends A{
 abstract void callme1();
 void callme();}
class C extends B{
void callme(){
 System.out.println("hi");
}
void callme1(){
System.out.println("hi");
}
}
public class Absstract{
    public static void main(String args[]){
           C c=new C();
               c.callme();
               c.callme1();
}      }

 
