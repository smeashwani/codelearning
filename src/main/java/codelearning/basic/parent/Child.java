package codelearning.basic.parent;
class Parent
{
    public Parent()
    {
        System.out.println("1-Parent class no-args constructor called");
    }
    public Parent(String name)
    {
        System.out.println("2-Parent class Parameterized constructor called by "+name);
    }
}
public class Child extends Parent
{
    public Child()
    {
        this("JIP");
        System.out.println("3-Child class no-args constructor called");
    }
    public Child(String name)
    {
       // super("JIP");
        System.out.println("4-Child class Parameterized constructor called by "+name);
    }
    public static void main(String args[])
    {
        Child c = new Child();
    }
}