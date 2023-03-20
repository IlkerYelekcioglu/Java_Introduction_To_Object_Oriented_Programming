public class ReturnDemo {
    public static void main(String[] args){
        System.out.println(max(10,5));
        System.out.println(max(5,10));
        System.out.println(max(5,5));
    }
    static int max(int val1,int val2){
        if(val1 > val2)
            return +1;
        else if (val1 < val2)
            return -1;
        else
            return 0;

        //System.out.println("Metodun sonu");
    }
    public void method1(){

    }
    public void method2(){
        return;
      //System.out.println("");
    }
    public String method3(){
        return new String("Java");
        //return null
    }
}
