class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //create HashMap
        HashMap <String, List<String>> map = new HashMap<>();

        //loop
        for(String s : strs){

            //create chars
            char[] chars = s.toCharArray();

            //arrange
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList(map.values());

    }
}
