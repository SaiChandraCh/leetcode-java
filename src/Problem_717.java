public class Problem_717 {
//    0 10 11
    public static void main(String[] args) {
        Problem_717 problem_717 = new Problem_717();
        System.out.println(problem_717.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }
    public boolean isOneBitCharacter(int[] bits) {
        int i,length=bits.length;
        if(bits[length-1]==0 && length>0){
            for (i = 0; i < length-1;) {
                if(bits[i]==0){
                    i++;
//                    System.out.println("1. "+bits[i]);
                }if(bits[i]==1){
//                    System.out.println("2. "+bits[i]+"\t"+bits[i+1]);
                    i=i+2;
                }
            /*2 conditions if 1 occurs increment by one */
            }
            return i==length-1;
        }else
            return false;
    }
}
