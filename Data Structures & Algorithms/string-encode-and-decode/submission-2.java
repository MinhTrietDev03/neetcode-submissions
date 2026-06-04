class Solution {

    public String encode(List<String> strs) {

        //Đung để ghep chuỗi hiệu quả
        StringBuilder res = new StringBuilder();

        //duyệt qua từng chuỗi
        for(String s: strs){

            // thêm vào độ dài + # + nội dung
            res.append(s.length())
                .append("#")
                .append(s);
        }
        return res.toString();

    }

    public List<String> decode(String str) {
        
        //kết quả được trả về
        List<String> res =  new ArrayList<>();
        
        //con trỏ chuột để duyệt chuỗi
        int i = 0 ;

        while(i < str.length()){

            //tim vi tri dau #
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            // lấy đọ dài của chuỗi
            int len = Integer.parseInt(str.substring(i, j));

            // vị trí bắt đầu dữ liệu
            int start = j + 1;

            //lấy đún len ký tự
            String word = str.substring(start, start + len);

            // thêm kết quả
            res.add(word);

            //nahyar tới chuỗi tiếp theo
            i = start + len ;

        }
        return res;

    }
}
