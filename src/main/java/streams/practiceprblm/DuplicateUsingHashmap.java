package streams.practiceprblm;

import java.util.HashMap;

public class DuplicateUsingHashmap {
    public static void main(String[] args) {
        String str = "abcabddpmncopqstcbcmc" ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        for(int i=0 ; i<str.length() ; i++){
            if(map.containsKey(str.charAt(i))){
                map.put((str.charAt(i)), (map.get(str.charAt(i)))+1 ) ;
            }else{
                map.put(str.charAt(i) , 1 ) ;
            }
        }
        for(Character a : map.keySet()){

                if(map.get(a)> 1 ){
                    System.out.println(a);
                }
        }

    }
}
