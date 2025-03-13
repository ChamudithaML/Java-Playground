import java.util.ArrayList;

public class SplitString {
    public static void main(String[] args){
        simpleSplitString("lil chama");
    }

    public static void simpleSplitString(String sentence){
        ArrayList<String> words = new ArrayList<>();
        String newWord="";
        sentence = sentence +" ";
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!=' '){
                newWord += sentence.charAt(i);
            }else {
                words.add(newWord);
                newWord="";
            }
        }

        System.out.println(words);
    }


}


