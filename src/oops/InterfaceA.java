package oops;
import java.util.*;

public interface InterfaceA {

    void call();

    default void sayHello() {

    }
}

interface InterfaceC extends InterfaceA {
    void ring();
}

class ClassA implements InterfaceC{

    public void ring(){

    }

    @Override
    public void sayHello() {
        InterfaceC.super.sayHello();

    }

    @Override
    public void call() {

    }
}
