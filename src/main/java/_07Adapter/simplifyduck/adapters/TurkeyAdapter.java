package _07Adapter.simplifyduck.adapters;

import _07Adapter.simplifyduck.interfaces.Duck;
import _07Adapter.simplifyduck.interfaces.Turkey;


/**
 * Now, let’s say you’re short on Duck objects and you’d like to use some
 * Turkey objects in their place. Obviously we can’t use the turkeys outright
 * because they have a different interface.
 * So, let’s write an Adapter:
 */

// needs to implement the interface of the type you`re adapting to. This is the interface your client expects to see.
    /* in our case turkeyAdapter implements the Duck interface which is the target
    Duck = target interface
    TurkeyAdapter = Adapter
    Turkey = adaptee interface


    Flow: the client makes a request to the adapter by using the target interface
    - the adapter translates the request intro one or more calls on the adaptee interface
    - the client recives the result of the call and never knows ther e is an adapter doing the translation

     */

/**
 * turning a turkey into a Duck
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    /**
     * we need to get a reference to the object that we are adapting;
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * we need to call turkey`s fly method 5 times to have a complete 1 fly() duck run.
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
