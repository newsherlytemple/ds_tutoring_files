package StackExample;

// interface for ADT stack !
public interface StackInterface<T>
{
    // adds a new object to the top of the stack
    // @param newEntry the object to add to the stack
    public void push(T newEntry);
    
    // removes and returns the object at the top of the stack
    // @return the object at the top of the stack
    // @throws EmptyStackException if the stack is empty before the operation
    public T pop();

    // returns the object at the top of the stack
    // @return the object at the top of the stack.
    // @throws EmptyStackException if the stack is empty
    public T peek();

    // determines if stack is empty
    // @return True if the stack is empty
    public boolean isEmpty();

    // removes all objects from the stack
    public void clear();

}