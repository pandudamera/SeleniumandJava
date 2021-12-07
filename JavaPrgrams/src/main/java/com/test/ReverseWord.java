package com.test;

public class ReverseWord 
{
   public static void main(String[] args) 
   {
      String input="Hello World";    //Input String 
      String[] words=input.split(" ");  //Split the word from String
      String[] revwords=new String[words.length];
      int j=0;
      for(int i=words.length-1;i>=0;i--)   //Loop for Reversing the Word  
      {
         revwords[j]=words[i];   //Storing the reversed words
         System.out.println(revwords[j]);
         j++;
      }  
   }
}