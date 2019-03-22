import java.util.*;
import java.io.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  // constructer and going pass warnings (if not give size)
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 1;
    size = data.length;
  }

  // constructer and going pass warnings (if given size)
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 1;
    size = initialCapacity;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "{";
    for (int i = start; i < data.length; i++){
      output += data[i] + " ";
    }
    return output + "}";
  }

  public void addFirst(E element){
    // throwing exception if element is not null
    if (element == null) throw new NullPointException("exception from addFirst");
  }

  public void addLast(E element){
    // throwing exception if element is not null
    if (element == null) throw new NullPointException("exception from addLast");

  }

  public E removeFirst(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from removeFirst");

  }

  public E removeLast(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from removeLast");

  }

  public E getFirst(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from getFirst");
    return data[start];
  }

  public E getLast(){
    // throwing exception if data set is empty
    if (size() == 0) throw new NoSuchElementException("from getLast");
    return data[end];
  }

}
