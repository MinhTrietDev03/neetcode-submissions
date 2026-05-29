class Solution {
    public boolean hasDuplicate(int[] nums) {
        //create HashSet
        HashSet set = new HashSet<>();

        //duyet qua phàn tu num
        for(int num : nums){
            //kiểm tra xem nó tồn tại tỏng num chưa
            if(set.contains(num)){
                return true;
            }
            // nếu chưa thêm vào set
            set.add(num);

        }
        return false;
    }
}