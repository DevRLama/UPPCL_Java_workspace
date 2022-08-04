package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        ArrayList<String> pat_match = new ArrayList<String>();
        int p_l=pattern.length();
        int[] pat=new int[p_l];
        pat=sub_pat_match_format(pattern);      
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()==p_l)
            {   
                int[] pat_words=new int[words[i].length()];
                pat_words=sub_pat_match_format(words[i]);
                if(Arrays.equals(pat, pat_words))
                {
                    pat_match.add(words[i]);
                }       
            }
        }
        
         return pat_match;
    }

   


    public int[] sub_pat_match_format(String pattern1){
        int pat_len=pattern1.length(),j=1;
        int[] pat_format=new int[pat_len];
        int flag=0;
        char temp;
        pat_format[0]=j;
        for(int i=1;i<pat_len;i++)
        {      temp=pattern1.charAt(i);
                for(int k=0;k<i;k++)
                {
                    if(pattern1.charAt(k)==temp)
                    {   
                        flag=1;
                        pat_format[i]=pat_format[k];
                        break;
                    }
            
                }
               if(flag==0)
                {
                    j++;
                    pat_format[i]=j;
                }
                flag=0;

        }
        return pat_format;
    }
}


public class FindAndReplace{
    public static void main(String[] args) {
        String words[]={"abc","deq","mee","aqq","dkd","ccc"};
        String pattern="abb";
        List<String> pat_match = new ArrayList<String>();
        //System.out.println(pattern.charAt(0));
        Solution s1=new Solution();
        pat_match=s1.findAndReplacePattern(words, pattern);
        System.out.println(pat_match);
    }
}