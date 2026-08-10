import java.util.*;
import java.io.*;

class Codechef
{
    static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        for(int i = 0; i < total; i++){
            int length  = sc.nextInt();
            String s = sc.next();
    		int conCounter = 0;
    		String result = "YES";

            for(int j = 0; j < length; j++){
                    if(isVowel(s.charAt(j))){
                        conCounter = 0;
                    }else{
                        conCounter++;
                        if(conCounter >= 4){
                            result = "NO";
                            break;
                        }
                    }

            }
            System.out.println(result);
        }
        
        sc.close();
	}
}
