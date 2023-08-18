public String[] uncommonFromSentences(String sentence1, String sentence2) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Count the occurrences of each word in sentence2
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> uncommonWords = new ArrayList<>();

        // Find the words with count = 1 (uncommon words)
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        // Convert the list to an array
        String[] result = new String[uncommonWords.size()];
        return uncommonWords.toArray(result);
    }
