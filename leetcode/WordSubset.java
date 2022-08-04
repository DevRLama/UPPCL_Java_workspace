package leetcode;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution1 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> pat_match = new ArrayList<String>();
        int j=0;
        for(int i=0;i<words1.length;i++)
        {
                for(j=0;j<words2.length;j++){   
                    if(!match(words1[i],words2[j]))                
                        {   
                            break;
                        }
                        
                }
                if(j==words2.length)
                {
                    pat_match.add(words1[i]);     
                }
        
        }
        return pat_match;
    }

    public boolean match(String pat,String mat)
    {
        int j=0,k=0;
        while(j<mat.length())
        {
            if(pat.indexOf(mat.charAt(j))==-1)
            {
               break;
            }else
            {
                
                j++;
                
            }
        }
        if(j==mat.length())
            return true;
        else
            return false;
    }
}


public class WordSubset {
    public static void main(String[] args){
        String words[]={"amazon","apple","facebook","google","leetcode","eo"};
        String pattern[]={"e","ooe"};
        List<String> pat_match = new ArrayList<String>();
        //System.out.println(pattern.charAt(0));
        Solution1 s1=new Solution1();
        pat_match=s1.wordSubsets(words, pattern);
        System.out.println(pat_match);

    }
}
