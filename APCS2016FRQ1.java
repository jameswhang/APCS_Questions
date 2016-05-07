class RandomStringChooser {
    private ArrayList<String> wordList;

    public RandomStringChooser(String[] array) {
        wordList = new ArrayList<String>();
        for(int i = 0; i < array.length; i++) {
            wordList.add(array[i]);
        }
    }
    public String getNext() {
        /*
         *       0. Check if wordList.length == 0, if so, return 'NONE'
         *             1. Choose a random index to remove from wordList
         *                   2. Remove the word with that index from wordList
         *                         3. Return that removed word
         *                             */
        String result = "";
        if(wordList.size() == 0) {
            return "NONE";
        }
        else {
            int randIndex = (int)(Math.floor(Math.random() * wordList.size()));
            result = wordList.get(randIndex);
            wordList.remove(randIndex);
        }
        return result;
    }
}

class RandomletterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        // Given //
    }
}
