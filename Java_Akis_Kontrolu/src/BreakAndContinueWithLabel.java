public class BreakAndContinueWithLabel {
    public static void main(String[] args){
        int[][] arrayofInts = {{ 32 , 87 ,3, 589},
                {  12, 1076 , 2000 , 12  },
                {   622, 122, 12, 12     }};

        int searchfor = 12;

        int i = 0;
        int j = 0;
        boolean foundIt = false;

        here: for(;i < arrayofInts.length;i++){
            for(j = 0 ; j < arrayofInts[i].length;j++){
                if(arrayofInts[i][j] == searchfor){
                    foundIt = true;
                    System.out.println("Found " + searchfor + " at " + i + " , " + j);
                    continue;
                }
            }
        }
        if(!foundIt)
            System.out.println(searchfor + " not in the array ");
    }
}
