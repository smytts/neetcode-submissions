class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         // create a HashMap of key: String and values: List<String> to store the solution
           Map<String, List<String>> solution = new HashMap<>();
           // Iterate through the array of Strings
            for (String s: strs) {
                int[] count = new int[26]; // Int array containing all 26 letters of the alphabet (assumes lower-case only)
                for (char c : s.toCharArray()){ // Iterate through the individual chars in each string of the String array
                    count[c - 'a']++; // Talley up amount of times a char appears in the array as a way to check if a word is an anagram of another
                }

                String key = Arrays.toString(count); // create a key out of the count array
                // check if the solution contains the newly formed key
                if (!solution.containsKey(key)) {
                    solution.put(key, new ArrayList<>()); // If key is not in solution already, then add it to a new ArrayList
                }
                solution.get(key).add(s); // Get the key from the solution HashMap and add the String s as a value
            }
           System.out.println(new ArrayList<>(solution.values()));
           return new ArrayList<>(solution.values()); // return the values stored in the solution HashMap
    }
}
