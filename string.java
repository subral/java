// class bubble{
//     public static void arr(){
//         int arr[] = {4,6,2,7,4,2,1};
//         for(int i=0; i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp;
//                     temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// class selection{
//     public static void arr(){
//         int arr[] = {4,3,26,1,8,6,5,4};
//         for(int i=0; i<arr.length;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                if(arr[smallest]>arr[j]){
//                 smallest = j;
//                }
//             }
//             int temp=arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;

//         }for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

class insertion{
    public static void arr(){
        int arr[]={9,65,43,56,5,245,24};
        for(int i=0;i<arr.length;i++){
            int sort = i;
            int j=i-1;
            while(j>=0 && arr[sort]<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
    }
}
public class string {
    public static void main(String[] args) {
        // String name = "subral";
        // StringBuilder sb = new StringBuilder(name);
        // for(int i=sb.length()-1; i>=0;i--){
        //     System.out.println(sb.charAt(i));
        // }
        insertion bob = new insertion();
        bob.arr();
    }
}
