class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int totalCount = 0;
        for(int i = 0; i < wordList.size(); i++) {
            totalCount += wordList.get(i).length();
        }
        return totalCount;
    }


    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList))/(wordList.size()-1);
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        /* implementation not shown */
    }

    public static String format(List<String> wordList, int formattedLen) {
        String result = "";
        int basicGap = basicGapWidth(wordList,formattedLen);
        int leftOverGap = leftoverSpaces(wordList,formattedLen);

        for(int i = 0; i < wordList.size(); i++) {
            result += wordList.get(i);
            if (i == wordList.size() -1 ) {
                break;
            }
            for(int j = 0; j < basicGap; j++) {
                result += " ";
            }
            if (leftOverGap != 0) {
                result += " ";
                leftOverGap--;
            }
        }
        return result;
    }
}
