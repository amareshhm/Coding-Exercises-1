import java.util.TreeSet;

class gfg1
{
    void task(TreeSet<String> ts,char a,char b,char c,char d)
    {
        TreeSet<String> list1 = new TreeSet<>(); 
        TreeSet<String> list2 = new TreeSet<>(); 
        TreeSet<String> list3 = new TreeSet<>(); 
        for(String s: ts){
            Character s1 = s.charAt(0);
            int a1 = s1.compareTo(a);
            int b1 = s1.compareTo(b);
            int c1 = s1.compareTo(c);
            int d1 = s1.compareTo(d);
            if(a1 < 0){
                list1.add(s);
            }
            if(b1 >= 0){
                list2.add(s);
            }
            if(c1 >= 0 && d1 < 0){
                list3.add(s);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
