class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //key = chuỗi sau khi sort
        //value = các từ thuộc cùng nhóm anagram

        // carete HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        //duyệt các hần tử trong s
        for(String s : strs){
            

            //chuyển thành các mảng ký tự
            char[] chars = s.toCharArray();

            //sắp xếp 
            Arrays.sort(chars);

            //cretea tạo key 
            String key =  new String(chars);

            //nếu chưa có key tồn tại thì tạo list mới
            //putIfAbsent: đặt mếu vắng mặt
            map.putIfAbsent(key, new ArrayList<>());

            //thêm phần tử hiện tại vòa nhóm
            map.get(key).add(s);
        }

        //return về danh sách toàn bộ các nhớm
        return new ArrayList<>(map.values());
    }
}
