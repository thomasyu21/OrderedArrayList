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
    NoNullArrayList<String> str2 = new NoNullArrayList<String>(5);
    System.out.println(str2);
    System.out.println();

    OrderedArrayList<Double> nums2 = new OrderedArrayList<Double>();
    nums2.add(10.0);
    nums2.add(5.0);
    nums2.add(15.0);
    nums2.add(14.0);
    nums2.add(1, 20.0);
    nums2.add(4, 10.0);
    nums2.add(3, 14.0);
    nums2.add(2, 30.0);
    System.out.println(nums2);
  }
}
