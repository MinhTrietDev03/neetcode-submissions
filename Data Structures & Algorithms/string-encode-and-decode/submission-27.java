class Solution {
    public String encode(List<String> strs) {
        // tạo một chuooix kết qura để ghép dữ liệu
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        // nhận về một chuỗi kết quả to decode
        List<String> res = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // lấy độ dài trước dấu #
            int len  = Integer.parseInt(str.substring(i, j ));

            // vị tri bắt đầu dữ liệu 
            int start = j +1;

            //lấy đúng len ký tự
            String word =  str.substring(start, start + len);

            //thêm kqq vào word;
            res.add(word);    

            i = start + len;
            
        }
        return res;
    }
}
