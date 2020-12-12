public class Tester{
  public static void main(String[] args){
    NoNullArrayList<Integer> nums = new NoNullArrayList<Integer>();
    System.out.println(nums.add(1));
    System.out.println(nums);
    //System.out.println(nums.add(null));
    NoNullArrayList<String> str = new NoNullArrayList<String>();
    System.out.println(str.add("test"));
    str.add(0, "test1");
    System.out.println(str);
    System.out.println(str.set(0, "test2"));
    //System.out.println(str.set(0, null));
    System.out.println(str.set(1, "test5"));
    System.out.println(str);
  }
