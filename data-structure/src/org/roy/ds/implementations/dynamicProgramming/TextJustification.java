package org.roy.ds.implementations.dynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = 0 ;
        int current = 0;
        List<String> arr= new ArrayList<>();
        List<String> tq = new LinkedList<>();
        for(int i=0;i<words.length;i++){
            len = len + words[i].length() + 1;

            if(len <= maxWidth){
                tq.add(words[i]);
                current = current + words[i].length() +1;
            }else{
                arr.add(justify(tq, maxWidth-current));
                //reset length
                len = 0;
                current = 0;
                //reset temp q
                tq= new LinkedList<>();
                tq.add(words[i]);
                current = current + words[i].length() +1;
            }
        }
        if(!tq.isEmpty()){
            arr.add(justify(tq, maxWidth-current));
        }
        return arr;
    }

    private String justify(List<String> q,int padding){
        int totalSpaces = q.size()-1 + padding;
        boolean even = totalSpaces%2==0?true:false;
        if(q.size()==1){
            return q.get(0)+generateSpaces(totalSpaces);
        }
        int spacing = totalSpaces/(q.size()-1)+1;
        int extraSpace = totalSpaces%2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i = 0;i<q.size();i++){
            if(i==1){
                sb.append(q.get(i)+generateSpaces(spacing+extraSpace));
            }else{
                sb.append(q.get(i)+generateSpaces(spacing));
            }
        }
        return sb.toString().trim();
    }

    private String generateSpaces(int n){
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; ++i){
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        TextJustification tj = new TextJustification();
        List<String> result = tj.fullJustify(words,maxWidth);
        for (String str: result) {
            System.out.println(str);
        }
    }
}
