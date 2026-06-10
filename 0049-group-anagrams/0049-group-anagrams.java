class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();
       for(int i = 0; i < strs.length; i++){
            // 1. ordena a palavra atual para usar como chave
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // 2. chave já existe no map?
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            // 3. adiciona a palavra original na lista
            map.get(key).add(strs[i]);
        }

        // 4. retorna todos os valores do map
        return new ArrayList<>(map.values());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna