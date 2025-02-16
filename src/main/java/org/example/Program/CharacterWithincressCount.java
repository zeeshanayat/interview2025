package org.example.Program;

public class CharacterWithincressCount {
    public static void main(String[] args) {
        String str="aabbccdddeeffggggg";
        //output=a2b2c2d2e2f2g4
        System.out.println(stringWithCountNumber(str));


    }

    static String stringWithCountNumber (String str)
    {
        if(str.isEmpty())
        {
            return  "";
        }
        StringBuilder stringBuilder= new StringBuilder();

        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if( str.charAt(i)  == str.charAt(i-1))
            {
                count ++;
            }
            else
            {
                stringBuilder.append(str.charAt(i-1)).append(count);
                count=1;
            }

        }
        stringBuilder.append(str.charAt(str.length()-1)).append(count);


        return stringBuilder.toString();

    }
}
