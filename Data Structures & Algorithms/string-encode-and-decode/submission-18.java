class Solution {

    public String encode(List<String> strs) {

        // careate res 
        StringBuilder res = new StringBuilder();

        for(String s : strs){
            
            res.append(s.length())
                .append('#')
                    .append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        //Give res 
        List<String> res = new ArrayList<>();

        int i=0;

        while(i < str.length()){
            
            int j =i;

            while(str.charAt(j) != '#'){
                j++;
            }

            //lấy độ dài phía trước #
            int len = Integer.parseInt(str.substring(i,j));

            // lấy vị tri bắt đầu
            int start =  j+1;

            //lấy vị trí phía sau
            String word = str.substring(start, start + len);

            res.add(word);

            i= start + len;
        }
        return res;

    }
}
