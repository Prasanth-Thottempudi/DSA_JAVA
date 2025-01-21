import java.util.Arrays;

public class P1OperationsOnArrays {

    static int findIndex(int[] a,int f){
        for(int i=0;i<a.length;i++){
            if(a[i]==f){
                return i;
            }

        }
        return -1;
    }

    static int[] insertElement(int[] a,int size, int pos, int val ){
        if(pos>a.length) return a;
        int ind=pos-1;
        for(int i=a.length-1;i>=ind;i--){
            a[i+1]=a[i];

        }
        a[ind]=val;
        return a;
    }

    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=4;
        a[3]=3;

       // System.out.println(findIndex(a,12));

        System.out.println(Arrays.toString(insertElement(a,4,2,10)));

    }
}
