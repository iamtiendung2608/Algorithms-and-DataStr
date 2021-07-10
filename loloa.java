public class loloa {
    static int n;
    static int[]result;
    static int []S;
    void out(){
        for(int i=0;i<n;i++)
            System.out.print(result[i]+"   ");
        System.out.println("");
    }
    public static void main(String[] args) {
        loloa a=new loloa();
        a.n=4;
        a.result=new int[n];
        a.S=new int [n];
        for(int i=0;i<n;i++){
            a.S[i]=0;
        }
        a.Fac(0);
    }
    void Fac(int k){
        for(int i=0;i<n;i++){
            if(S[i]==0){
                result[k]=i;
                S[i]=1; 
                if(k==n)
                    out();
                else
                    Fac(k+1);
                S[i]=0;    
            }
        }
    }
}