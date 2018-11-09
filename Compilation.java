//Compilation of Activities
/*Gomez, Renz Rallion T.
CITCS 1D-2*/
package compilation;
import java.util.Scanner;
public class Compilation {
static long f(int n){
    if(n <= 1)
        return n;

    else
        return f(n-1)+f(n-2);
}
    public static void main(String[] args) {
        //Activity 1 Areas
        System.out.println("Activity 1 Areas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Triange");
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter height: ");
        int b = sc.nextInt();
        int c = a*b;
        int d = c/2;
        System.out.println("The area of the triangle is: " +d+ "\n");
        System.out.println("Circle");
        System.out.print("Enter radius: ");
        int e = sc.nextInt();
        int f = (int) Math.pow(e,2);
        double g = f*Math.PI;
        System.out.println("The area of the circle is: " +g+ "\n");
        System.out.println("Square");
        System.out.print("Enter length of side: ");
        int h = sc.nextInt();
        int i = (int) Math.pow(h,2);
        System.out.println("The area of the square is: " +i);
        
        //Activity 2 Calculator
        System.out.print("\n");
        System.out.println("Activity 2 Calculator");
        System.out.println("Enter a number:");
        int j = sc.nextInt();
        System.out.println("Enter another number:");
        int k = sc.nextInt();
        System.out.println("Enter operation:");
        String o = sc.next();
        
        System.out.println("The result is:");
        switch(o){
            case ("add"):
            case ("+"):
                System.out.println(j+k);
                break;
                
            case ("subtract"):
            case ("-"):
                System.out.println(j-k);
                break;
                
            case ("multiply"):
            case ("*"):
                System.out.println(j*k);
                break;
                
            case ("divide"):
            case ("/"):
                System.out.println(j/k);
                break;
                
            case ("modulo"):
            case ("%"):
                System.out.println(a%b);
                break;
               
            default:
                System.out.println("Invalid input");
    }
        //Activity 3 Courses
        System.out.print("\n");
        System.out.println("Activity 3 Courses");
        System.out.print("Enter your Department:");
        String l = sc.next();
        System.out.print("Enter your Course: ");
        if("COA".equals(l)){
            String m = sc.next();
            if("BSA".equals(m)){
                System.out.println("Your college is COA and your course is BSA");
                System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHED MEMORANDUM ORDER NO. 3 Series of 2007, which is based on International Education Standards aimed to equip students to meet the competencies required in the workplace whether in the country or abroad. It is an 11 trimester course (3 years plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students to be liberally educated accountants who can think and write clearly, effectively, and critically. It also prepares them to become total business advisors, who are knowledgeable with business structures and economic concepts; and trains them to be ethically and technically competent in the field of accounting and auditing.");
            }else if("BSAT".equals(m)){
                System.out.println("Your college is COA and your course is BSAT");
                System.out.println("The BSAcT is a program that prepares students for a career in the accounting and finance divisions of organizations in the private and public sectors. The accounting courses in the BSAcT program, combined with business management courses, equip students with the needed skills, proficiency, and intellectual abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and industry, government, and education, need support staff who will work as bookkeepers, financial analysts, audit staff, inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.");
            }else if("BSMA".equals(m)){
                System.out.println("Your college is COA and your course is BSMA");
            }else if("BSFA".equals(m)){
                System.out.println("Your college is COA and your course is BSFA");
            }
        }
        if("CEA".equals(l)){
            String m = sc.next();
            if("BSA".equals(m)){
                System.out.println("Your college is CEA and your course is BSA");
            }else if("BSCE".equals(m)){
                System.out.println("Your college is CEA and your course is BSCE");
            }else if("BSComE".equals(m)){
                System.out.println("Your college is CEA and your course is BSComE");
            }else if("BSEE".equals(m)){
                System.out.println("Your collage is CEA and your course is BSEE");
            }else if("BSESE".equals(m)){
                System.out.println("Your college is CEA and your course is BSESE");
            }
        }
        if("CITCS".equals(l)){
            String m = sc.next();
            if("BSCS".equals(m)){
                System.out.println("Your college is CITCS and your course is BSCS");
            }else if("BSIS".equals(m)){
                System.out.println("Your college is CITCS and your course is BSIS");
            }else if("BSIT".equals(m)){
                System.out.println("Your college is CITCS and your course is BSIT");
            }else if("ACT".equals(m)){
                System.out.println("Your college is CITCS and your course is ACT");
            }
        }
        if("CTE".equals(l)){
            String m = sc.next();
            if("BSEE-G".equals(m)){
                System.out.println("Your college is CTE and your course is BSEE-G");
            }else if("BSEE".equals(m)){
                System.out.println("Your college is CTE and your course is BSEE");
            }else if("BSSE".equals(m)){
                System.out.println("Your college is CTE and your course is BSSE");
            }
        }
        if("CAS".equals(l)){
            String m = sc.next();
            if("BAE".equals(m)){
                System.out.println("Your college is CAS and your course is BAE");
            }else if("BAPS".equals(m)){
                System.out.println("Your college is CAS and your course is BAPS");
            }else if("BAC".equals(m)){
                System.out.println("Your college is CAS and your course is BAC");
            }else if("BSP".equals(m)){
                System.out.println("Your college is CAS and your course is BSP");
            }
        }
        if("CBA".equals(l)){
            String m = sc.next();
            if("BSBA".equals(m)){
                System.out.println("Your college is CBA and your course is BSBA");
            }else if("BSE".equals(m)){
                System.out.println("Your college is CBA and your course is BSE");
            }else if("BSOA".equals(m)){
                System.out.println("Your college is CBA and your course is BSOA");
            }
        }
        //Activity 4 Guessing Game
        System.out.print("\n");
        System.out.println("Activity 4 Guessing Game");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        System.out.print("Guess the number: ");
        int p = sc.nextInt();
        while(p != n){
            int q = 0;
            while(p != n){
            System.out.println("Try Again: ");
            if(p > n){
                System.out.println("The number to be guessed is lower");
            }else{
                System.out.println("The number to be guessed is higher");
            }if(p % 2 == 0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }
            
            q++;
            System.out.println("Number of tries:" +c);
            p = sc.nextInt();
            }
            System.out.println("Correct!");
        }
        //Activity 5 Even and Odd sorting
        System.out.print("\n");
        System.out.println("Activity 5 Even and Odd sorting");
        System.out.println("EVEN"+"\t"+"ODD");
        int array1[] = {3,9,15,20,65,23,18,4,2,14,21,11};
        int r[] = new int[array1.length];
        int s[] = new int[array1.length];
        int t = 0;
        int u = 0;
        int v;
        
        for(v = 0; v < array1.length; v++){
            if(array1[v] % 2 == 0){
                
                r[t] = array1[v];
                t++;
            }  
        }
        for(v = 0; v < array1.length; v++){
            if(array1[v] % 2 != 0){

                s[u] = array1[v];
                u++;
            }
        }
        int w;
        for(w = 0; w < s.length; w++){
            if(r[w] != 0){
                System.out.print(r[w] +"\t");
            }else{
                System.out.print("\t");
            }
            
            if(s[w] != 0){
                System.out.println(s[w]);
            }else{
                System.out.print("\n");
            }
        }
        //Activity 6 Two-dimensional Array (User Input)
        System.out.print("\n");
        System.out.println("Activity 6 Two-dimensional Array (User Input)");
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int column = sc.nextInt();
        String num[][] = new String[row][column];
        System.out.println("Enter elements");
        for(int x = 0; x < row; x++){
            for(int y = 0; y < column; y++){
                System.out.print("Row " + x +" Column " + y +": ");
                String z = sc.next();
                num[x][y] = z;
            }
                    
        }
        System.out.print("\n");
        System.out.println("Given Data to Array:");
        for(int a1 = 0; a1 < row; a1++){
            System.out.print("Row " +a1 +": ");
            for(int b1 = 0; b1 < num[a1].length; b1++){
                System.out.print(num[a1][b1] +"\t");
            }System.out.print("\n");
        }
        //Activity 7 Fibonnaci Method
        System.out.print("\n");
        System.out.println("Activity 7 Fibonnaci Method");
        System.out.print("Enter a number: ");
        int c1 = sc.nextInt();
        for(int d1 = 0; d1 <= c1; d1++){
            System.out.print("f("+d1+")" + "\t");
        }System.out.print("\n");
        
        for(int d1 = 0; d1 <= c1; d1++){
            for(int e1 = 0; e1 <= d1; e1++){
                System.out.print(f(e1) +"\t");}
            System.out.print("\n");
        }
}
}
