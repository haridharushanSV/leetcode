class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int a = 0 , b = 0 ;

        for(int i = 0 ; i < distance.length ;i++)
        {
            if((i >= Math.min(start,destination)) && (i < Math.max(start,destination)))
            {
                a += distance[i];
            }
            else
            {
                b += distance[i];
            }
        }

        return Math.min(a,b);
    }
}