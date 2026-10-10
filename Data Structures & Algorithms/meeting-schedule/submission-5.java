/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */



class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //sắp xếp danh sách theo thử tự từ nhỏ đến lớn
        Collections.sort(
            intervals,
            Comparator.comparingInt(interval -> interval.start)
        );
        //Bắt đầu cuộc hợp thứ 2
        for(int i = 1; i< intervals.size(); i++){
            
            // lấy meeting đứng trước meeting hiện tại 
            Interval previous = intervals.get(i-1);

            //lấy cuộc họp hiện tại
            Interval current = intervals.get(i);

            if(previous.end > current.start){
                
                // cuộc họp trước đã kết thúc 
                //những cuộc họp hiện tại đã bắt đầu 
                return false;

            }
        }
        return true;

    }
}
