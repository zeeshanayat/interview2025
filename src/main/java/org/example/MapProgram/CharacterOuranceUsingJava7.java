package org.example.MapProgram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CharacterOuranceUsingJava7 {

    public static void main(String[] args) {

        String str="zeshanAhmad";
        str= str.toLowerCase();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer>  entryMap: map.entrySet())
        {
           System.out.println(entryMap.getKey()+"  "+ entryMap.getValue());
        }
    }


}
class    CharacterOuranceUsingJava8
{
    public static void main(String[] args) {

        String str="zeshanAhmad";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .filter(e -> !e.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.print(collect);

    }
}
class    CharacterOuranceUsing8NoneRepeting
{
    public static void main(String[] args) {

        String str="zeshanAhmad";

       String first = String.valueOf(Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .filter(e -> !e.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst());


System.out.print(first);
    }

}

class  OnlyFindDuplicate {
    public static void main(String[] args) {

        String str = "zeeshanAhmad";

        List<String> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entryset -> entryset.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.print(collect);

    }
}
    class  findFirstReptingCharacter
    {
        public static void main(String[] args) {

            String str="zeeshanAhmad";

            Optional<String> first = Arrays.stream(str.split(""))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entryset -> entryset.getValue() > 1).
                    map(Map.Entry::getKey).findFirst();
            System.out.print(first);

        }
}


