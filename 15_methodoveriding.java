import java.util.Scanner; 
class RBI{
    float ROI(){
        return 8.8F;
    }
}

class SBI extends RBI {
    float ROI(){
        return 10.8F;
    }
}
class PNB extends RBI{
    float ROI(){
        return 9.8F;
    }
}
class HDFC extends RBI{
    float ROI(){
        return 81.8F;
    }
}

class ICICI extends RBI{
    float ROI(){
        return 83.8F;
    }
}
 class RBIROI {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.println("1 for PNB\n 2 for SBI\n 3 for HDFC\n 4 for ICICI");
    int a= sc.nextInt();  
    switch (a) {
        case 1:
            PNB p=new PNB();
            System.out.println("Rate of interest of PNB"+ p.ROI());
            break;
            case 2:
            SBI s=new SBI();
            System.out.println("Rate of interest of SBI"+ s.ROI());
            break;
            case 3:
            HDFC h=new HDFC();
            System.out.println("Rate of interest of HDFC"+ h.ROI());
            break;
            case 4:
            ICICI i=new ICICI();
            System.out.println("Rate of interest of ICICI"+ i.ROI());
            break;
        default:
        System.out.println("invalid input");
            break;
    }
 }   
}
