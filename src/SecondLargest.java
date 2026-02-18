public class SecondLargest {
    public static void main(String[] args){

        int[] arr = {56 , 67 , 87 , 97 , 90};
        int large = -1;
        int secondlarge = -1;

        for(int i: arr){
            if(i==-1 || i>large){
                secondlarge=large;
                large=i;

            }
            else if(i!=large && secondlarge==-1 || i>secondlarge){
                secondlarge=i;
            }
        }
        if(secondlarge==-1){
            System.out.println("no secondlarge");
        }else{
            System.out.println("second large: " + secondlarge );
        }

    }
}
