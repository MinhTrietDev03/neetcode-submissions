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
            // 
            int len = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            String word = str.substring(i , i + len);

            // thêm kq vao word
            res.add(word);

            // sang chuoi tiep theo
            i += len;
        }
        return res;
    }
}
