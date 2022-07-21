// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            String res = obj.solve(N, arr);
            
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends
class Solution {
 public static String solve(int N, int[] arr) {
        int sum = 0;
        //int noOfSet = 0;
        int count = 0;
        int flag = 1;
        for(int divi = 2; divi<=N; divi=divi+2){
        for(int i = 0; i<N; i++){
            sum = sum+arr[i]; 
            count++;
            if (count%divi==0){  
                if(sum!=0)
                 flag = 0;
            sum =0;
            count = 0;
            }
        }
        System.out.println(flag);
        }
       if (flag==1)
         return "YES";
        else
        return "NO";
       
    }
}