import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Cannot take value null");
    }else{
      super.add(value);
      return true;
    }
  }

  
}
