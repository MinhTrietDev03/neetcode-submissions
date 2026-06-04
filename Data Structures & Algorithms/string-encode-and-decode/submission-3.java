class Solution {

    public String encode(List<String> strs) {

        // tạo chuỗi kết quả để ghép dữ liệu
        StringBuilder res = new StringBuilder();

        // duyệt từng chuỗi trong danh sách
        for (String s : strs) {

            // thêm: độ dài + # + nội dung chuỗi
            // ví dụ: "neet" -> "4#neet"
            res.append(s.length())
               .append('#')
               .append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {

        // danh sách kết quả
        List<String> res = new ArrayList<>();

        // con trỏ đang đứng tại vị trí hiện tại
        int i = 0;

        // duyệt tới hết chuỗi encode
        while (i < str.length()) {

            // j dùng để tìm dấu #
            int j = i;

            // tăng j cho tới khi gặp dấu #
            while (str.charAt(j) != '#') {
                j++;
            }

            // lấy độ dài chuỗi trước dấu #
            // ví dụ "4#neet" -> len = 4
            int len = Integer.parseInt(str.substring(i, j));

            // vị trí bắt đầu dữ liệu
            int start = j + 1;

            // lấy đúng len ký tự
            String word = str.substring(start, start + len);

            // thêm vào kết quả
            res.add(word);

            // di chuyển tới chuỗi kế tiếp
            i = start + len;
        }

        return res;
    }
}