import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }
    int index = 0;
    for (int i = 0; i < this.size(); i++){
      if (value.compareTo(this.get(i)) > 0){
        index = i+1;
      }
    }
    if (index != 0){
      super.add(index, value);
    }else{
      super.add(0, value);
    }
    return true;
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }
    int index2 = 0;
    for (int i = 0; i < this.size(); i++){
      if (value.compareTo(this.get(i)) > 0){
        index2 = i+1;
      }
    }
    if (index2 != 0){
      super.add(index2, value);
    }else{
      super.add(0, value);
    }
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }
    T element = this.get(index);
    this.remove(index);
    this.add(value);
    return element;
  }
}
