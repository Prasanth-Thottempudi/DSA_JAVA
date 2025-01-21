package RECURSION;

public class P12GenerateSubSets {

    static void genSubSets(String s,String curr,int i){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        genSubSets(s,curr,i+1);
        genSubSets(s,curr+s.charAt(i),i+1);

    }
    public static void main(String[] args) {
        genSubSets("AB","",0);


    }
}
