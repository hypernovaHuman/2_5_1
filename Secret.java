public class Secret {
    //Attributes
    String fullWord = "";
    String partialWord = "";

    //Constructors
    public Secret() {
        fullWord = WordProvider.getWord();
        System.out.println(fullWord);
        for (int i = 0; i < fullWord.length(); i++) {
            partialWord += "_";
        }
        System.out.println(partialWord);
        partialWord = fullWord.replaceAll(".", "_");
        System.out.println(partialWord);
    }
    
    public String getFullWord(){
        return fullWord;
    }

}
