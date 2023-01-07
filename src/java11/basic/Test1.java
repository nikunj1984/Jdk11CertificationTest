package java11.basic;

class SubClass {
    public static String classyName = "abc";
    public static String getClassyName() { return classyName; }
}
 
public class Test1 extends SubClass {
    public static String classyName = "def";
    public static String getClassyName() { return classyName; }
 
    public static void main(String[] args) {
        Test1 tt = new Test1();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;
 
        int tempcount = ((Test1) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;
 
        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++; //compilstion fails bx of this
 
        tempcount = tt.getClassyName((Test1) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;
 
        System.out.println("abcCount = " + abcCount);
    }
 
    public String getClassyName(Object t) {
        Test1 tt = (Test1) t;
        return tt.getClassyName();
    }
 
    public String getClassyName(SubClass sc) {
        return sc.getClassyName();
    }
}