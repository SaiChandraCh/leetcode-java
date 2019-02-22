public class Problem_937 {
    public String[] reorderLogFiles(String[] logs) {
        int len = logs.length,index=0;
        String[] reOrderLog = new String[len];
        for (int j=0; j<len ; j++) {
            if(!Character.isDigit(logs[j].split(" ")[1].charAt(0))){
                reOrderLog[index]=logs[j];
                logs[j]=null;
                index++;
            }
        }
        for (int i = 0; i < index-1; i++) {
            if(reOrderLog[i].split(" ")[1].compareTo(reOrderLog[i+1].split(" ")[1])>0){
                String temp = reOrderLog[i];
                reOrderLog[i] = reOrderLog[i+1];
                reOrderLog[i+1] = temp;
                i=-1;
            }else if(reOrderLog[i].split(" ")[1].compareTo(reOrderLog[i+1].split(" ")[1]) == 0 && reOrderLog[i].split(" ")[0].compareTo(reOrderLog[i+1].split(" ")[0])<0){
                    String temp = reOrderLog[i];
                    reOrderLog[i] = reOrderLog[i+1];
                    reOrderLog[i+1] = temp;
                    i=-1;
            }
        }
        for (int j=0; j<len ; j++) {
            if(logs[j] != null){
                reOrderLog[index]=logs[j];
                logs[j]=null;
                index++;
            }
        }
        return reOrderLog;
    }

    public static void main(String[] args) {
        Problem_937 problem_937 = new Problem_937();
        for (String s : problem_937.reorderLogFiles(new String[]{"qi ir oo i", "cp vnzw i", "0 fkbikbts", "4 j trouka", "gn j q al", "5r w wgqc", "m8 x haje", "fg 28694 6", "i gf mwdoa", "ao 0850716"})) {
            System.out.println(s);
        }
    }
}
