public class first {
    public static void main(String[] args){

       /* int [] flat=new int[5];
        flat[0]=101;
        flat[1]=102;
         flat[2]=103;
          flat[3]=104;
           flat[4]=105;

           for(int i=0;i<flat.length;i++){

           System.out.println(flat[i]);

    }*/

    
      /*  int[][]flat=new int[2][3];
       flat[0][0]=101;
       flat[0][1]=102;
       flat[0][2]=103;
       flat[1][0]=201;
       flat[1][1]=202;
       flat[1][2]=203;

       for(int i=0;i<=flat.length;i++){
        for(int j=0;j<=flat.length;j++){
            System.out.print(flat[i][j]);
        }
       
       }


       /*float[]flat={2.1f, 2.2f ,2.3f ,2.5f ,2.6f};
       float sum=0;
       for(float element:flat){
        sum=sum+element;
       }
        System.out.print(sum);*/

        /*int[] b={1,2,3,4,5};
        int num=2;
        boolean isInArray=false;
        for(int element:b){
            if(element==num){
                isInArray=true;
            }
            break;
        }
        if(isInArray){
            System.out.print("number is match");

        }
        else{
            System.out.print("number is not match");
        }*/

        /*int []physics={20,80,70};
        int sum=0;

        for(int element:physics){
        sum=sum+element;
        }
        int avg=sum/2;
        System.out.print("average of the array"+" "+avg);*/
        



        /*int [][]number=new int[2][3];
        number[0][0]=100;
        number[0][1]=105;
        number[0][2]=106;
        number[1][0]=107;
        number[1][1]=108;
        number[1][2]=109;

       
        for(int i=0;i<=number.length;i++){
            for(int j=0;j<number.length;j++){
                 System.out.print(number[i][j]);
            
            }
           
        }*/

        /*int []reverse=new int[5];
        reverse[0]=100;
        reverse[1]=101;
        reverse[2]=102;
        reverse[3]=103;
        reverse[4]=104;

        for(int i=reverse.length-1;i>=0;i--){
            System.out.print(reverse[i]);
            System.out.print(" ");
            System.out.print("\n");;
           
        }*/

        /*int[] arr={1,2,3,4,5};
        int L=arr.length;
        
        int n =Math.floorDiv(L,2);
        int temp;
       
      

       for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[L-i-1];
            arr[L-i-1]=temp;
        }
        for (int element:arr){
            System.out.print(element);
        }*/

        /*int[]arr={1,20,4,3,5,6};
        int max=0;
        for(int element:arr){
            if(element>max){
                max=element;
            }

            }
            System.out.println("maximum number is:"+max);*/

          /* int[]arr={100,2,3,4,5};

           int min=Integer. MAX_VALUE;
            
           for(int element:arr){
            if(element<min){
                min=element;

            }

           }
         System.out.print(min);*/

         boolean isSorted=true;
         int[]arr={1,2,3,255,266,277};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                int temp=arr[i];
                break;

            }
        }
        if(isSorted){
            System.out.print("array is sorted"+temp);
        }
        else{
            System.out.print("array is not sorted"+temp);
        }


    











        

         



       
      








       


    








    }
    
}
