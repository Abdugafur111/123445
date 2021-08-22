public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = new int[100];
        for(int i=1; i<x.length-1;i++){
           x[i]= (int)(Math.random() *10);
        }

        for(int i=0;i<x.length;i++){
            x[i]++;
        }

        for(int i=0;i<x.length;i++){
           System.out.println("There are " + i + " " + x[i]);
       }
    }
}
