public class Main {

    public static void main(String[] args) {

        oper<Integer> op1;
        oper<Double> op2;
        oper<String> op3;
        op1=(  x,  y ) -> x + y;
        op2=( x, y ) -> (x +y) / (x-y);
        op3=( x, y ) -> x+y;

        System.out.println(op1.todo(23,45));
        System.out.println(op2.todo(22.0,45.0));
        System.out.println(op3.todo("23","45"));

        un<Integer> op = (n)-> ( n>0 ?n :-n);
        System.out.printf("one num %d, two num %d\r\n",op.r(10), op.r(-10));


        double[] arr1 = {6.35,2.0,5.01,3.5,2.7,6.1,0.01};
        for (double d:arr1){System.out.printf("%.2f; ",d);}
        un<Double> op4 = (x)-> Math.sqrt(x);
        System.out.printf("\r\nsumm sqrt: %.2f\r\n",sum(arr1,op4));
        un<Double> op5 = (x)-> x*x;
        System.out.printf("summ sqr: %.2f\r\n",sum(arr1,op5));
        op5 = (x)-> (x<5?0:x*x);
        System.out.printf("summ sqr if num >5 : %.2f\r\n",sum(arr1,op5));


    }
      static double sum (double[] arr, un<Double> func){
       double res = 0;
        for (double it:arr){
            res+=func.r(it);
        }
        return res;
    }

}
interface oper<T> {
    T todo(T a, T b);
}
interface un<T>{
    T r(T n);
}