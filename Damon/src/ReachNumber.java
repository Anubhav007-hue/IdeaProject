public class ReachNumber {
    public static void main(String[] args)
    {
        int target=2;

        System.out.print(reachNumber(target));
    }

    public static int reachNumber(int target) {

        return calculate(1,0,target);

    }

    private static int calculate(int current, int steps, int target) {


        if(current==target)
        {
            return steps;
        }
        steps++;

        if(current+steps>target)
        {
            return calculate(current-steps,steps,target);
        }

        return calculate(current+steps,steps,target);
    }


}
