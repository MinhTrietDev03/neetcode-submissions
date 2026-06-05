class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for(String s : strs){
            //độ dài  + # + s
            res.append(s.length())
                .append('#')
                .append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {

        //Give res to decode
        List<String> res = new ArrayList<>();

        int i =0;

        while(i < str.length()){
            int j= i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            int start = j + 1 ;

            String word = str.substring(start , start + len );

            res.add(word);
            
            i = start +len;
        }
        return res;

    }
}
