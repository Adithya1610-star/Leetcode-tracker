// Last updated: 7/10/2026, 3:53:49 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int a[]=arr.clone();
4        Arrays.sort(a);
5        HashMap<Integer,Integer>map=new HashMap<>();
6        int rank=1;
7        for(int num:a){
8            if(!map.containsKey(num)){
9                map.put(num,rank++);
10            }
11        }
12        int r[]=new int[arr.length];
13        for(int i=0;i<arr.length;i++){
14            r[i]=map.get(arr[i]);
15        }
16        return r;
17    }
18}