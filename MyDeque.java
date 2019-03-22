public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 1;
    size = data.length;
  }

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
    for (int i = 0; i < data.length; i++){
      output += data[i] + " ";
    }
    return output + "}";
  }

  public void addFirst(E element){
    if (element == null) throw new NullPointException("exception from addFirst");
  }

  public void addLast(E element){
    if (element == null) throw new NullPointException("exception from addLast");

  }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){
    if (size() == 0) throw new NoSuchElementException("from getFirst");
    return data[start];
  }

  public E getLast(){
    if (size() == 0) throw new NoSuchElementException("from getLast");
    return data[end];
  }

}
