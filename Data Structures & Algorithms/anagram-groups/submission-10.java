class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //create HashMap
        HashMap<String, List<String>> map = new  HashMap<>();

        //duyệt qua các kí tự strs
        for(String s: strs){

            //chuyển các kí tự sang mảng ký tự char[]
            char[] chars = s.toCharArray();

            //sort : xắp xếp
            Arrays.sort(chars);

            // tạo key
            String key = new String(chars);

            //nêú chưa có key thì thêm vào List mới
            map.putIfAbsent(key, new ArrayList<>());

            // thêm từ hiện tại vào nhóm

            map.get(key).add(s);
        }

        // return về toàn bộ các nhóm
        return new ArrayList<>(map.values());

    }
}
