public class ScopeDemo {

    int i = 1;
    //	String i = "Naber abi";

    public static void main(String[] args){

        int i = 0;

        System.out.println(i);

        //int i =2  // Yenilenen değişken

        for(;i<5;i++){

            System.out.println(i);
          if(i<3){

              //boolean i = true;
              int ii=3;
              int a;
              f(ii);
          }else if(3 < i & i <12){
              int ii=9;
              f(ii);
          }else{
              int ii = 19;
              f(ii);
          }
         int ii = 11;
        }
    }
    public  static void f(int i) {
          //int i = 6;
        System.out.println(i);
    }

    public void f(){
       //int i = 7;
        System.out.println(i);
    }
    public void ff(){
       int i = 8;
       System.out.println(i);
    }

public void forwardreference(){
// int i = j;
// int j = 7;
System.out.println(i);
}
}
