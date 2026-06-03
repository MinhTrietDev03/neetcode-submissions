class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //create HashMap
        HashMap<String , List<String>> map = new HashMap<>();

        //duyệt ra các phần tử có trong strs
        for(String s : strs){

            //chuyển các mảng thành ký tự
            char[] chars = s.toCharArray();

            //sắp xếp các kí tự
            Arrays.sort(chars);

            //create key 
            String key = new String (chars);

            //Nếu key chưa tồn tại thì putIfAbsent : thêm vào chỗ mới
            map.putIfAbsent(key, new ArrayList<>());
            // thêm từ hiện tại vào nhóm s
            map.get(key).add(s);
        }
            // trả về cách bộ phần nhóm
            return new ArrayList<>(map.values());
    }
}
