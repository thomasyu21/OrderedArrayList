import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T value){
    int index = 0;
    for (int i = 0; i < this.size(); i++){
      if (value.compareTo(this.get(i)) >= 0){
        index = i;
      }
    }
    if (index == 0){
      super.add(0, value);
    }else{
    super.add(index+1, value);
    }
    return true;
  }

  public void add(int index, T value){
    int index2 = 0;
    for (int i = 0; i < this.size(); i++){
      if (value.compareTo(this.get(i)) >= 0){
        index2 = i;
      }
    }
    if (index2 == 0){
      super.add(0, value);
    }else{
    super.add(index2+1, value);
    }
  }

  public T set(int index, T value){
    int index2 = 0;
    for (int i = 0; i < this.size(); i++){
      if (value.compareTo(this.get(i)) >= 0){
        index2 = i;
      }
    }
    return super.set(index2, value);
  }
}
