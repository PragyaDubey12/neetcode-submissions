class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int l = position.length;
        double[] distance = new double[l];
        double[] time = new double[l];
        Integer[] order = new Integer[l];
        for (int i = 0; i < l; i++) {
            order[i] = i;
        }
        Arrays.sort(order, (a, b) ->
            Integer.compare(position[b], position[a]));
        for (int idx = 0; idx < l; idx++) {
            int i = order[idx];
            distance[idx] = target - position[i];
            time[idx] = distance[idx] / speed[i];
            if (stack.isEmpty() || time[idx] > stack.peek()) {
                stack.push(time[idx]);
            }
        }
        return stack.size();
    }
}
