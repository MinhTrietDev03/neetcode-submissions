class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //create một hashmap
        HashMap <String, List<String>> map = new HashMap<>();

        //duyệt qua các phần tử strs
        for(String s : strs){

            // chuyển các ký tự sang char[]
            char[] chars = s.toCharArray();

            //sắp xếp 
            Arrays.sort(chars);

            //create một key mới
            String key = new String(chars);

            // nếu chưa có key thì thêm kí tự đó vào mảng mới
            map.putIfAbsent(key , new ArrayList<>() );

            map.get(key).add(s);
        }

        // return về array list new
        return new ArrayList<>(map.values());

    }
}
