class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder res = new StringBuilder();

        //dueetj qua các chuỗi
        for(String s : strs){
            
            res.append(s.length())
                .append('#')
                .append(s);

        }
        return res.toString();

    }

    //giai ma
    public List<String> decode(String str) {

        // nhận chuỗi để giai mã
        List<String> res = new ArrayList<>();

        //đặt con trỏ để duyệt chuỗi
        int i=0;

        while(i < str.length()){
            int j = i;

            //loop cho đến khi #
            while(str.charAt(j) != '#'){
                j++;
            }

            // lấy phần độ dài trước #
            int length = Integer.parseInt(str.substring(i,j));

            // lấy vị trí bắt đầu
            int start = j + 1;

            // lấy vih trí phía sau
            String word =  str.substring(start, start+ length);

            res.add(word);

            i = start + length;
        }

        return res;
    }
}
