class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        // duyệt các phần tử có trong mảng strs

        for (String s : strs) {
            // chuyển về char[]
            char[] chars = s.toCharArray();

            // sắp xếp
            Arrays.sort(chars);

            // create key
            String key = new String(chars);

            // nếu kí tự trong char[] chưa có key thì thêm vào một mảng mới
            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
}
