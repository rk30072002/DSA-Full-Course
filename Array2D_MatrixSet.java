import java.util.Scanner;
class Array2D_MatrixSet{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    boolean Row[]=new boolean[n];
    boolean Colum[]=new boolean[m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();

        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][i]==0){
                Row[i]=true;
                Colum[j]=true;
                
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(Row[i] && Colum[j] || Row[j] && Colum[i]){
                a[i][j]=0;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}











// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter how many number n:");
//     int n=sc.nextInt();
//     System.out.print("Enter how many number m:");
//     int m=sc.nextInt();
//     int a[][]=new int[n][m];
//     int Row[]=new int[n];//better s.p 
//     int Colum[]=new int[m];

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             a[i][j]=sc.nextInt();

//         }
        
//     }

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//         if(a[i][j]==0){
//             Row [i]=1;
//             Colum [j]=1;
            
            
//         }
//         }
//     }
    
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(Row[i]==1 || Colum[j]==1){
//             a[i][j]=0;
            
//             }
//         }
    
//     }
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print(a[i][j]+" ");
//         }
//     System.out.println();
//     }
    
//     }
// }
// import java.util.Scanner;

// class Test {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter how many number n:");
//         int n = sc.nextInt();
//         System.out.print("Enter how many number m:");
//         int m = sc.nextInt();
//         int a[][] = new int[n][m];
//         int Row[] = new int[n];
//         int Colum[] = new int[m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 a[i][j] = sc.nextInt();
//                 // if (a[i][j] == 0) {
//                 //     Row[i] = 1; // Marking row i as having a zero
//                 //     Colum[j] = 1; // Marking column j as having a zero
//                 // }
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//             if(a[i][j]==0){
//             Row [i]=1;
//             Colum [j]=1;
            
            
//         }
//         }
//         }

//         for (int i = 0; i < n; i++) {
//             if (Row[i] == 1) {
//                 for (int j = 0; j < m; j++) {
//                     if (a[i][j] != 0) {
//                         a[i][j] = -1;
//                     }
//                 }
//             }
//         }

//         for (int j = 0; j < m; j++) {
//             if (Colum[j] == 1) {
//                 for (int i = 0; i < n; i++) {
//                     if (a[i][j] != 0) {
//                         a[i][j] = -1;
//                     }
//                 }
//             }
//         }

//         // Resetting -1 to 0
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (a[i][j] == -1)
//                     a[i][j] = 0;
//                     System.out.print(a[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }






// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter how many number n:");
//     int n=sc.nextInt();
//     System.out.print("Enter how many number m:");
//     int m=sc.nextInt();
//     int a[][]=new int[n][m];
    

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             a[i][j]=sc.nextInt();

//         }
        
//     }
// int Colum=1;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//         if(a[i][j]==0){
//             a[i][0]=0;
//             if(j!=0)
//             a[0][j]=0;
//             else
//             Colum=0;
            
            
//         }
//         }
//     }

//     for(int i=0;i<n;i++){
//         for(int j=1;j<m;j++){
//             if(a[i][j]!=0){
//                 if(a[0][j]==0 || a[i][0]==0){
//                     a[i][j]=0;
//                 }
//             }
//         }
//     }
//     if(a[0][0]==0){
//         for(int j=0;j<m;j++)
//         a[0][j]=0;
//     }
//     if(Colum==0){
//         for(int i=0;i<n;i++){
//             a[i][0]=0;

//         }
//     }
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
            
//             System.out.print(a[i][j]+" ");
//         }
//         System.out.println();
//     }
//     }
    
//     }