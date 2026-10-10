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
        Collections.sort(
            intervals,
            Comparator.comparingInt(interval -> interval.start)
        );

        for(int i =1 ; i< intervals.size(); i++){

            //get meeting 2second
            Interval pre = intervals.get(i-1);

            Interval current = intervals.get(i);

            if(pre.end > current.start){
                return false;
            }
        }
        return true;
    }
}
