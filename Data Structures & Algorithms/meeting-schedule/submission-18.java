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

//input interval
//output: false or true




class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //Sắp xêp tăng dần
        Collections.sort(
            intervals,
            Comparator.comparingInt(interval -> interval.start)
        );

        //Do chúng ta lấy ở cuộ họp thứ 2, tức là phần tử thứ 2 nê i =1
        for(int i = 1 ; i < intervals.size() ; i++){

            // lấy thời gain cuộc họp thứ 2
            Interval previous = intervals.get(i-1);

            Interval current = intervals.get(i);

            if(previous.end > current.start){
                return false;
            }
        }
        return true;
    }
}
