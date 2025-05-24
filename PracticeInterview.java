import java.util.*;

public class PracticeInterview {
    public static void main(String[] args) {

        rev_num(); //using while loop
        rev_using_forloop();    //using for loop
        rev_String();   //rev a string
        palindrome_of_num();
        palindrime_of_String();
        rev_array();


        swap_WAY1();  //swapping techniques
        swap_WAY2();
        swap_WAY3();
        swap_WAY4();
        swap_WAY5();
        array_swap();

        Sum_of_num();
        sum_of_num_using_whileloop();
        multiply();
        count_NUMBERS(); //using while loop  //for loop is for some specific values like "10" or "5";
        count_String();
        case_count();
        Count_vovels_in_String();
        Sum_Count_Even_or_Odd_Numbers_in_Array();
        sum_of_array();

        min_max();
        Second_largest_element();
        Second_min_ELEMENT();
        K_largest_element();
        K_largest_element_brootforce();     // easy
        K_Smallest_element_brootforce();    // easy

        prime_or_not();
        generating_primenum();
       // isPrime();

        case_convertion();
        missing_numbers();  //NEED TO WRITE CODE
        remove_duplicate_to_fing_min_max();
        Sq_root();
        fibnocci();
        krishnamoorthi_number();
        perfect_number();
        amstrong_num();

        // recursion & sum of num
        // infy array swap
    }

    public static void rev_num() {
        int num=12345;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("rev using whileloop: "+rev);
        System.out.println("\n -----------------------");
    }

    public static void rev_using_forloop() {
        int num = 123456789;
        String snum = Integer.toString(num);
        String revnum = " ";
        for (int i = snum.length() - 1; i >= 0; i--) {
            revnum += snum.charAt(i);
        }
        System.out.println("re using forloop: "+revnum);
        System.out.println("\n -----------------------");
    }

    public static void rev_String() {
        String name="nawaz";
        String rev="";
        for(int i=name.length()-1; i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println("rev string: "+rev);
        System.out.println("\n -----------------------");
    }

    public static void palindrome_of_num() {
        int num=12821;
        int rev=0;
        int pali=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.print("palindrome_of_num: ");
        if(pali==rev) System.out.print("palindrome");
        else System.out.print("not a palindrome");
        System.out.println("\n -----------------------");
    }

    public static void palindrime_of_String() {
        String name="malayalam";
        String rev="";
        //String pali=name;
        for(int i=name.length()-1 ; i>=0; i--){
            rev+=name.charAt(i);
        }
       // System.out.println("palindrome of string "+rev);
       if(name.equals(rev)) System.out.println("string is pali");
        else System.out.println("string is not pali");
        System.out.println("\n -----------------------");
    }

    public static void rev_array() {
        int num[]={1,2,3,4,5};
       
        for(int i=num.length-1; i>=0; i--){
            System.out.print (num[i]);
        }
        
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void swap_WAY1() {
        int a=10;
        int b=20;

        int t=a;
            a=b;
            b=t;
            System.out.println(a);
            System.out.println(b);
            System.out.println("\n -----------------------");
    }

    public static void swap_WAY2() {
        int a=10;                       //  step1: (b=a) ->> b=10
        int b=20;                       // step2: a=10+20=30 ; so a=30 
        a = a + b - (b = a);            //  Step3: 30-(10) -> a=20 
         System.out.println(a);
         System.out.println(b);
         System.out.println("\n -----------------------");
    }

    public static void swap_WAY3() {
        int a=10;
        int b=20;
        a=a-b;
        b=a+b;
        a=b-a;
         System.out.println(a);
         System.out.println(b);
         System.out.println("\n -----------------------");
    }

    public static void swap_WAY4() {
        int a=10;
        int b=20;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("\n -----------------------");
    }

    public static void swap_WAY5() {
        int a=10;
        int b=20;

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("\n -----------------------");
    }

    public static void array_swap() {
        int arr[]={1,2,3,4,5,6};
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        // for(int num:arr){    
        //     System.out.print(num+", ");
        // }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n -----------------------");

    }
//////////////////////////////////////////////////////////////////////////////////////////
    public static void Sum_of_num() {
        int num=10;
        int sum=0;

        for(int i=0; i<=num; i++){
            sum=sum+i;
        }
       //System.out.println("sum of num " +num+" := "+sum);
        System.out.printf("sum of num %d: %d%n", num, sum);
        System.out.println("\n -----------------------");
    }

    public static void sum_of_num_using_whileloop() {
        int num=99999;
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        System.out.println("sum of num using while loop: "+sum);
        System.out.println("\n -----------------------");

    }

    public static void multiply() {
        int num=5;
        int mul=1;              //// it is same as factorial of num

        for(int i=1; i<=num; i++){
            mul*=i;
        }
        System.out.printf("multiply of num %d: %d%n",num,mul);
        System.out.println("\n -----------------------");
    }

    public static void count_NUMBERS() {
        long num=7418506968L;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("count of integers: "+count);
        System.out.println("\n -----------------------");

    }

    public static void count_String() {
        String name="nawaz";
        int count=name.length();
        System.out.println("count of String "+name+" is "+count);
        System.out.println("\n -----------------------");

    }

    public static void case_count() {
        /// counting uppercase & lower case elements present in a String
        String val="AlPhaBetS";
        int upper_count=0; //counting uppercase elements
        int lower_case=0;  //Counting lowercase elements

        for(int i=0; i<val.length(); i++){
            if(Character.isUpperCase(val.charAt(i))) upper_count++;
            else lower_case++;
        }
        System.out.println("UPPER CASE "+upper_count);
        System.out.println("LOWER CASE "+lower_case);
        System.out.println("\n -----------------------");
    }

    public static void Count_vovels_in_String() {
        String name="mohammadnawazsheriff";
        int count=0;
        char ch[]={'a','e','i','o','u'};
        
        for(int i=0; i<name.length();i++){
            for(int j=0;j<ch.length;j++){
                if(name.charAt(i)==ch[j]) count++;
            }
        }
        System.out.println("count of vowels in string: "+count);
        System.out.println("\n -----------------------");
    }

    public static void  Sum_Count_Even_or_Odd_Numbers_in_Array() {
        int arr[]={4,5,7,8,9,6,3,2,1};
        int ODD_CC=0;   /// 1,3,5,7,9
        int EVEN_CC=0;   // 2,4,6,8
        int ODD_SUM=0;
        int EVEN_SUM=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                EVEN_CC++;
                EVEN_SUM+=arr[i];
            }
            else {
                ODD_CC++;
                ODD_SUM+=arr[i];
            }
            
        }
       
        System.out.println("ODD COUNT: "+ODD_CC);
        System.out.println("ODD SUM: "+ODD_SUM);

        System.out.println("EVEN COUNT: " +EVEN_CC);
        System.out.println("EVEN SUM: "+EVEN_SUM);
        System.out.println("\n -----------------------");

    }

    public static void sum_of_array() {
        int arr[]={1,2,3,4,5};
        int sum=arr[0];
        for(int i=1; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum_of_array "+sum);
                System.out.println("\n -----------------------");

    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////




    public static void min_max() {
        int arr[]={4,5,8,7,6,20};
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
           if(arr[i]<min){
            min=arr[i];
           }
        }
        System.out.println("max: "+max+" min: "+min);
        System.out.println("\n -----------------------");

    }

    public static void Second_largest_element() {
                // 0,1,2,3,4,5,6,7,8,9
        int arr[]={1,5,8,7,4,9,6,13,11};

        int max1=0,max2=0;
        if(arr[0]> arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max1=arr[1]; //5 -> //8
            max2=arr[0]; //1 -> //5
        }
        for(int i=2; i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]> max2){
                max2=arr[i];
            }
        }
        System.out.println("Second largest element: "+max2);
        System.out.println("\n -----------------------");

    }

    public static void Second_min_ELEMENT() {
       int arr[]={5,7,2,6,1,3,88};
       int min1=0,min2=0; 

       if(arr[0]<arr[1]){
        min1=arr[0]; //5 -> //2
        min2=arr[1]; //7 -> //5
       }
       else{
        min1=arr[1];
        min2=arr[0];
       }
       for(int i=2;i<arr.length;i++){
        if(arr[i]<min1){
            min2=min1;
            min1=arr[i];
        }
        else if(arr[i]<min2){
            min2=arr[i];
        }
       
       }
    System.out.println("Second largest element: "+min2);
    System.out.println("\n -----------------------");

}

    public static void K_largest_element() {
                 //1,2,3,4,5,6,7,8,9,10
        int arr[]={7,8,5,4,1,2,3,6,9,10,47};
        int k=3;
                        // OPTIMISED TECHNIQUE
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for( int val: arr){
            minHeap.add(val);
            if(minHeap.size()> k){
                minHeap.poll();
            }
        }
        System.out.println("K th largest element: "+minHeap.peek());
        System.out.println("\n -----------------------");
    }

    public static void K_largest_element_brootforce() {     
        int arr[]={3,2,1,6,5,4,7,8,9};
        int k=2;                            // the best

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println("k^th largest element: "+arr[i]);
                //break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n -----------------------");
    }

    public static void K_Smallest_element_brootforce() {
        int arr[]={8,7,4,55,1,2,6,9,69};
        int k=3;
                            /// brootforce tech
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println("K_Smallest_element: "+arr[i]);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n -----------------------");

    }
/////////////////////////////////////////////////////////////////////////////////////////////////

    public static void prime_or_not() {
        int num=41;
        boolean isPrime=true;
        for(int i=2 ; i<num; i++){
            if(num%i==0){
                System.out.println("noo");
                isPrime=false;
                break;
            }
        }
        if(isPrime) System.out.println("prime");
        System.out.println("\n -----------------------");

    }

    /*public static void isPrime() {
        int num=25;
        for(int i=2; i<num; i++){  /// this technique is a failure
            if(num%i==0){
                System.out.println("false");
                break;
            }
            else{
                System.out.println("isPrime or not: "+"true");
            }
        }
        

        System.out.println("\n -----------------------");

    }*/

    public static void generating_primenum() {
        int start=2;
        int last=100;
        int count=0;    // count
        int sum=0;      // sum
        for(int i=start; i<last;i++){
            int check=0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    check++;
                }
            }
            if(check==2){
                
                System.out.print(i+", ");
                
                count++;        /// WE ARE COUNTING HOW MANT PRIME NUMBERS ARE THERE
                System.out.println(count);
                sum+=i;
            }
           
        }
        System.out.println("\n PRIME NUM COUNT: "+count);
        System.out.println("\n SUM OF PRIME NUM: "+ sum);
        System.out.println("\nPRIME NUMBERS ");
        System.out.println("\n -----------------------");

    }
   

    public static void case_convertion() {
        String s="zaid ibrahim";           /// converting EVEN case into UPPER CSE
        String upper="";
        for(int i=0; i<s.length();i++){
            if(i%2==0){
               upper+= Character.toUpperCase(s.charAt(i));
            }
            else{
                upper+=s.charAt(i);
            }
        }
        System.out.println(upper);
        System.out.println("\n -----------------------");

    }

    public static void missing_numbers() {

        // formula to find missing num in array
        // [1,2,4,5,6] -> missing is 3
        // total sum =n*(n+1)/2= 5*(6)/2 =15
        // sum =1+2+4+5+6=18
        // missing val=totalsum - sum =3
        int sum=0;
        int arr[]={1,2,4,5,6};
        int tot_sum= arr.length*(arr.length+1)/2;
        for(int num:arr){
            sum+=num;
        }
        int miss_val=sum-tot_sum;
       System.out.println("missing val "+miss_val);
                System.out.println("\n -----------------------");


    }
    public static void remove_duplicate_to_fing_min_max() {
        int arr[]={1,1,2,2,5,4,6,3,9,5};
        int unique[]=Arrays.stream(arr).distinct().sorted().toArray();
        System.out.println(Arrays.toString(unique));

        int max=unique[0];
        for(int i=0; i<unique.length; i++){
            if(unique[i]>max){
                max=unique[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("\n -----------------------");
    }

    public static void Sq_root() {
        double num=625;
        double sqroot=Math.sqrt(num);
        System.out.println("sq root "+num+" = " +sqroot);
                System.out.println("\n -----------------------");

    }

    public static void fibnocci() {
        int num=10;
        int a=0;
        int b=1;
        int i=1;
        while (i< num){
            int c=a+b;
                a=b;
                b=c;
                i++;
                System.out.println("FIBNOCI SERIES "+a);
        }
                System.out.println("\n -----------------------");

    }

    public static void krishnamoorthi_number() {
        int num=145;
        int original=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==original){
            System.out.println("krishnamoorthi_number");
        }
        else{
            System.out.println("nooo");
        }
                        System.out.println("\n -----------------------");

    }

    public static void perfect_number() {
        int num=28;
        int sum=0;
        for(int i=1; i<num; i++){
           if(num %i ==0){
            sum+=i;
           }
        }
        if(num==sum){
            System.out.println("PERFECT NUM");
        }
        else{
            System.out.println("NOOO");
        }
         System.out.println("\n -----------------------");
    }

    public static void amstrong_num() {
        int num=153;
        int sum=0;
        int amstrong=num;

        while(num!=0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num/=10;
        }
        if(sum==amstrong){
            System.out.println("AMSTRONG NUM");
        }
        else{
            System.out.println("noo");
        }

         System.out.println("\n -----------------------");
    }
}

