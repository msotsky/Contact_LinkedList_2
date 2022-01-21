public class test {
    
    public static int mystery(int val, int j){
        if(j > 0){
            return val + mystery(val, j-2);
        }
        return j;
    }

    public static int sumOdd(int num){
        if(num == 0){
            return 0;
        }
        if(num %2 != 0){
            return num%2 + sumOdd(num % 10);
        }
        else{
            return 0 + sumOdd(num - num % 10);
        }
    }
    public static void main(String[] args){
        System.out.println(mystery(2,5));

        System.out.println(sumOdd(224));
        //0
        System.out.println(sumOdd(111));
        //3
    }
}
