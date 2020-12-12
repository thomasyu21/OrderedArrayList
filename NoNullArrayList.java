import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }else{
      return super.add(value);
    }
  }

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }else{
      super.add(index, value);
    }
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }else{
      return super.set(index, value);
    }
  }
}
