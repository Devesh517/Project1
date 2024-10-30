import java.util.*;
public class face3
{
    Scanner x = new Scanner(System.in);
    String a;
      int n;
     int i,j;
     int[] arr= new int[30]; 
        public static void main(String args[])
        {
        face3 f= new face3();
        f.method1();
        }
       void method1(){
        System.out.println("Select Operation");
        System.out.println("1.String");
        System.out.println("2.Array");
        System.out.println("3.Pattern");
        char c;
         c=x.next().charAt(0);
         x.nextLine(); 
        if(c=='1')
        {
            System.out.print("\033[H\033[2J");  
             System.out.flush();  
            stringabc();
        }
         if(c=='2')
        {
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            array();
        }
         if(c=='3')
        {
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            pattern();
        }
       }
       void stringabc(){
        System.out.println("Enter String:");
        a = x.nextLine();
        operations1();
       }
       void array()
       {
        System.out.println("Enter Limit");
        n=x.nextInt();
        System.out.println("Enter Array Elements");
        for(i=0; i<n; i++){
            arr[i]= x.nextInt();
       }
            operations2();
       }
        void pattern()
        {
            System.out.println("Enter Limit");
        n=x.nextInt();
        operations3(); 
        }
        void operations1(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Select The Following Operation");
        System.out.println("1.String Reverse");
         System.out.println("2.String Place Reverse");
         System.out.println("3.First Letter Capital");
         System.out.println("4.Both Place and String Reverse");
         System.out.println("5.Return To Main Menu");
        char b;
         b=x.next().charAt(0);
         if(b=='1'){
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
             System.out.println("1.String Reverse");
             String s="  "; String  s1="  ";
             int i;
    
           for(i=0; i<a.length(); i++){
           if(a.charAt(i)!=' ' && (i != a.length()-1)){ 
            s1=a.charAt(i)+s1;
           }
           else{
            if(i==a.length()-1){ 
            s1=a.charAt(i)+s1;
            }
            s = s + s1 +" ";
            s1 = "  ";
         }
    }
    System.out.println("Output \n"+s);
    eng();
    
         }
         if(b=='2'){
             System.out.print("\033[H\033[2J");  
             System.out.flush();  
             System.out.println("2.String Place Reverse");
              
    String s="  "; String  s1="  ";
    int i;
    for(i=0; i<a.length(); i++){
        if(a.charAt(i)!=' ' && (i != a.length()-1)){ 
         s1=s1+a.charAt(i);
        }
         else{
            if(i==a.length()-1){ 
            s1=s1+a.charAt(i);
            }
        s=" "+s;
        s=s1+s;
        s1=" ";
         }
    }
    System.out.println("Output \n"+s);
    eng();
         }
         if(b=='3'){
             System.out.print("\033[H\033[2J");  
             System.out.flush(); 
          System.out.println("3.Frist Letter Capital"); 
    int i;
    StringBuffer s= new StringBuffer(a);
    for(i =0; i<s.length()-1; i++){
        if(i==0 || s.charAt(i - 1)==' '){
            s.replace(i, i+1, String.valueOf(Character.toUpperCase(s.charAt(i))));
        }
    }
    System.out.println(s.toString());
        eng();
         }
         if(b=='4'){
             System.out.print("\033[H\033[2J");  
             System.out.flush(); 
           System.out.println("4.Both Place and String Reverse");

         StringBuffer s=new StringBuffer(a);
         s.reverse();
         System.out.println(s+" ");
        
         eng();
         }
         if(b=='5'){
            method1();
         }
        }
        void operations2()
        {
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.println("Select From Following Operations");
         System.out.println("1. Insertion");
         System.out.println("2. Deletion");
         System.out.println("3. Traversal");
         System.out.println("4. Sorting");
         System.out.println("5. Searching");
          char d ;
         d=x.next().charAt(0);
         if(d=='1'){
           System.out.println("1. Insertion");
           System.out.println("Insertion have 3 operations");
           System.out.println("1. Insertion at Beginning");
           System.out.println("2. Insertion at given position");
           System.out.println("3. Insertion at end");
           char o;
           o=x.next().charAt(0);
           if(o=='2'){
            ins1();
           }
           if(o=='1'){
            ins2();
           }
           if(o=='3'){
            ins3();
           }
         }
          if(d=='2'){
           System.out.println("2. Deletion");
           System.out.println("Deletion have 3 operations");
           System.out.println("1. Deletion at Beginning");
           System.out.println("2. Deletion at given position");
           System.out.println("3. Deletion at end");
           char o;
           o=x.next().charAt(0);
           if(o=='1'){
            del1();
           }
           if(o=='2'){
            del2();
           }
           if(o=='3'){
            del3();
           }
         }
         if(d=='3'){
           System.out.println("3. Traversal");
           System.out.print("Array Elements Are\n");
             for(i=0; i<n;i++){
                System.out.print(+arr[i]+" ");
             }
             ash();
         }
         if(d=='4'){
            System.out.println("4. Sorting");
            System.out.println("Sorting have 2 operations");
           System.out.println("1.Selection Sort");
           System.out.println("2.Bubble Sort");
            char o;
           o=x.next().charAt(0);
           if(o=='1'){
            select();
           }
           if(o=='2'){
            bubble();
           }
        
            
         }
         if(d=='5'){
           System.out.println("5. Searching");
            System.out.println("Searching have 2 operations");
           System.out.println("1.Binary Search");
           System.out.println("2.Linear Search");
           char o;
           o=x.next().charAt(0);
           if(o=='1'){
            bina();
           }
           if(o=='2'){
            lin();
           }
         }  
        }
        void operations3(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
            System.out.println("Select From Following Patterns");
        System.out.println("1.Reverse Right Angle Triangle");
         System.out.println("2.Right Angle Triangle");
         System.out.println("3.Square");
         System.out.println("4.K-Pattern");
         System.out.println("5.Hollow Square");
         System.out.println("6.Left Pyramid");
         System.out.println("7.Pascal Triangle");
         System.out.println("8.Hollow Triangle");
          System.out.println("9.Return To Main Menu");
          char e;
          e=x.next().charAt(0);
          if(e=='1'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
            System.out.println("1.Reverse Right Angle Triangle");
            int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
        System.out.println();
        } 
         abz(); 
         }
         if(e=='2'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
          System.out.println("2.Right Angle Triangle");
           int i,j;
        for(i=1; i<(n+n-1); i++){
            if(i<=n){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("  ".repeat(n-i));
            }
            else{
                System.out.print("  ".repeat(i-n));
            }
        }
         abz(); 
         }
         if(e=='3'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
             System.out.println("3.Square");
             int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                System.out.print("*");
            }
          System.out.println();
        }
         abz(); 
         }
         if(e=='4'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
          System.out.println("4.K-Pattern");
          int i,j;
    for(i=1; i<=(n+n-1);i++)
    {
     if(i<=n)
     {
     System.out.println("".repeat(i-1)+"*".repeat(n-i+1));
     }
     else{
        System.out.println("".repeat(n-(i-n))+ "*".repeat(i-n+1));
     }
    }
     abz(); 
         }
         if(e=='5'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
          System.out.println("5.Hollow Square");
          int i,j;
        for(i=0; i<n;i++){
            for(j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         abz(); 
         }
         if(e=='6'){
            System.out.print("\033[H\033[2J");  
        System.out.flush();  
            System.out.println("6.Left Pyramid");
            int i,j;
        for(i=0; i<n; i++){
            for(j=2*(n-i); j>=0; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         abz(); 
         }
         if(e=='7'){
            System.out.print("\033[H\033[2J");  
           System.out.flush();  
            System.out.println("7.Pascal Triangle");
             int i,j;
        for(i=0; i<=n-1; i++)
        {
            for(j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        for(i=n-1; i>=0; i--){
            for(j=0; j<=i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        } 
         abz(); 
         }
         if(e=='8'){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
           System.out.println("8.Hollow Triangle");
           int i,j,k;
            for(i=1; i<=n; i++){
            for(j=i; j<n; j++){
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                if(k==1|| i==n || k==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        abz(); 
         }
        
          }
           
            void abz(){
            System.out.println("1.Return To Main Screen");
             System.out.println("2.Operation change but inserted value do not change");
             System.out.println("3.Exit From Program press any key");
             System.out.println("4.Change Input");
             char z;
              z=x.next().charAt(0);
              if(z=='1'){
                method1();
              }   
              if(z=='2'){
                operations3();
              }
              if(z=='4'){
                pattern();
              }
              else{
                System.out.println("Thank You");
              }
           }
           void ins1(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
            int pos,data;
            System.out.println("Enter Position (0 to " + n + "):");
    pos = x.nextInt();
    System.out.println("Enter Data:");
    data = x.nextInt();
    for (i = n; i > pos; i--) {
        arr[i] = arr[i - 1];
    }
    arr[pos] = data; 
    n++; 

    System.out.println("After Insertion, Elements Are:");
    for (i = 0; i < n; i++) {
        System.out.println(arr[i]);
    }
    ash();
           }
           void ins2(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
               int data;
               System.out.println("Enter Data");
    data=x.nextInt();
    for(i=n; i>0; i--){
        arr[i]=arr[i-1];
         }
        arr[0]=data;
    System.out.println("After Insertion Elements Are");
    for(i=0;i<=n;i++)
     System.out.println(arr[i]);
     ash();
           }
         void ins3(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
            int data;
            System.out.println("Enter Data");
    data=x.nextInt();
        arr[n]=data;  
    System.out.println("After Insertion Elements Are");
    for(i=0;i<=n;i++)
     System.out.println(arr[i]);
     ash();
         }
         void del1(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
           int pos=0;
           for (i =pos; i < n-1 ; i++) {
            arr[i] = arr[i + 1];
          }
        n=n-1; 
        System.out.println("After Deletion Elements Are:");
        for (i = 0; i < n; i++) { 
        }
            System.out.println(arr[i]);
            ash();
         }
         void del2(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
             int pos;
           System.out.println("Enter Position to Delete");
          pos = x.nextInt();
          for (i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; 
        System.out.println("After Deletion, Elements Are:");
        for (i = 0; i < n; i++) { 
            System.out.println(arr[i]);
        }
        ash();
         }
         void del3(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
            int pos=n;
            for (i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; 
        System.out.println("After Deletion Elements Are:");
        for (i = 0; i < n; i++) { 
            System.out.println(arr[i]);
         }
         ash();
          }
          void select(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
           int t;
            System.out.println("Unsorted Array");
    for(i=0; i<n; i++)
    System.out.print(arr[i]+" ");
     for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(arr[i]>arr[j]){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
     } 
 System.out.println("\nAfter Selection Sorting Array Elements Are");
 for(i=0; i<n; i++)
    System.out.print(arr[i]+" ");
    ash();
          }
          void bubble(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
            int t;
            System.out.println("Unsorted Array:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
            for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    
                     t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
         System.out.println("\nAfter Bubble Sorting, Array Elements Are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        ash();
          }
          void lin(){
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
            System.out.println("Enter Element That You Want To Search");
         int v=x.nextInt();
        boolean found = false;
        for ( i = 0; i < n; i++) {
            if (arr[i] == v) {
                found = true;
                break; 
            }
        }

        
        if (found) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
        ash();
          }
          void bina()
          
          {
             System.out.print("\033[H\033[2J");  
           System.out.flush();  
             System.out.println("Enter Element That You Want To Search:");
        int v = x.nextInt();
        Arrays.sort(arr);
        int index = binarySearch(arr, v);
        if (index != -1) {
            System.out.println("Element Is Present : " );
        } else {
            System.out.println("Element Is Not Present");
        }
        ash();
    }
    public static int binarySearch(int[] arr, int v) {
        int st = 0;
        int end = arr.length - 1; 
        while (st <= end) {
            int mid = st + (end - st) / 2; 
            if (arr[mid] == v) {
                return mid; 
            } else if (arr[mid] > v) {
                end = mid - 1; 
            } else {
                st = mid + 1; 
            }
        }
        return -1; 
        
          }
          void ash(){
            
            System.out.println("\n\n1.Return To Main Screen");
             System.out.println("2.Operation change but inserted value do not change");
             System.out.println("3.Exit From Program press any key");
             System.out.println("4.You Want to change input");
             char z;
              z=x.next().charAt(0);
              if(z=='1'){
                method1();
              }   
              if(z=='2'){
                operations2();
              }
              if(z=='4'){
                 array();
              }
              else{
                System.out.println("Thank You");
              }
           }
           void eng() {
         
        System.out.println("1.Return To Main Screen");
        System.out.println("2.Operation Change But Value Not");
        System.out.println("3.Change The Input");
        System.out.println("4.Exit From Program press any key");
         char p = x.next().charAt(0);
          if(p=='1'){
            method1();
          }
          else if(p=='2'){
            operations1();
          }
          else if(p=='3'){
          efd();
          }
          else{
            System.out.println("Thank You");
          }
    
}
void efd(){
    System.out.println("Enter String");
    a=x.nextLine();
    x.nextLine();
    operations1();
}
}
