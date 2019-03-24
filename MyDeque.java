import java.util.*;
import java.io.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  // constructer and going pass warnings (if not give size)
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    //start = 0;
    //end = 1;
    //size = data.length;
  }

  // constructer and going pass warnings (if given size)
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    //start = 0;
    //end = 1;
    //size = initialCapacity;
  }

  public int size(){
    return size;
  }

  // standard toString
  public String toString(){
    String output = "{";
    int index = start;
    for (int i = 0; i < size; i++){
      output += data[index % data.length] + " ";
      index++;
    }
    return output + "}";
  }

  public void addFirst(E element){
    // throwing exception if element is not null
    if (element == null) throw new NullPointerException("exception from addFirst");
    if (size == data.length) resize();
    if (size != 0){
      if (start == 0) start = data.length - 1;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    // throwing exception if element is not null
    if (element == null) throw new NullPointerException("exception from addLast");

  }

  public E removeFirst(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from removeFirst");
    return data[0];
  }

  public E removeLast(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from removeLast");
    return data[0];
  }

  public E getFirst(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from getFirst");
    return data[start]; // returns start
  }

  public E getLast(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from getLast");
    return data[end]; // returns end
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    //making sure theres enough room in the temp array so og * 2 + 1
    E[] temp = (E[]) new Object[size() * 2 + 1];
    int index = start;
    for (int i = 0; i < size; i++){
      // copying elements over from og array
      temp[i] = data[index % data.length];
      index++;
    }
    start = 0;
    end = size - 1;
    data = temp;
  }
}
