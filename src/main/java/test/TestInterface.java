package test;

public interface TestInterface {

    default void methodA(){
        System.out.println("methodA default");
    }
}
