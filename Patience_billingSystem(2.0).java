import java.util.Scanner;
public class javaTest1 {
    public static void main(String[] args) {
//MAIN VARIABLES
        double hospital_bill,drs_fee,lab_fees,other_charges,room_charges,tax;
        /*VALUE HOLDER for the MAIN VARIABLE*/
        //DOCTORS FEES
        double anaesthesiologist_fee,specialist_fee,surgions_fee;
        //LAB FEES
        double xray,cbc,blood_typing,urinalysis;
        //OTHER CHARGES
        double extra_beddings,syringes,dextrose,dressing_liquid,medicine;
        //ROOM CHARGES
        double confine_days,rrt_perday;

        //Create an object of scanner class
        Scanner input = new Scanner(System.in);
        /*INPUT & OUTPUT STATEMENT*/
        System.out.println("\n**** CLIENT'S PAYMENTS ****\n");
        System.out.println("\nHow many days confine :");
        confine_days= input.nextDouble();
        System.out.println("Rate perday           :");
        rrt_perday= input.nextDouble();
        System.out.println("Anaesthesiologist_fee :");
        anaesthesiologist_fee= input.nextDouble();
        System.out.println("Specialist_fee        :");
        specialist_fee= input.nextDouble();
        System.out.println("Surgions_fee          :");
        surgions_fee= input.nextDouble();
        System.out.println("Xray fee              :");
        xray= input.nextDouble();
        System.out.println("Cbc fee               :");
        cbc= input.nextDouble();
        System.out.println("Blood_typing fee      :");
        blood_typing= input.nextDouble();
        System.out.println("Urinalysis fee        :");
        urinalysis= input.nextDouble();
        System.out.println("Extra_beddings fee    :");
        extra_beddings= input.nextDouble();
        System.out.println("Syringes fee          :");
        syringes= input.nextDouble();
        System.out.println("Dextrose fee          :");
        dextrose= input.nextDouble();
        System.out.println("Dressing_liquid fee   :");
        dressing_liquid= input.nextDouble();
        System.out.println("Medicine fee          :");
        medicine= input.nextDouble();
        input.close();
        //FINAL RESULT OUTPUT
        System.out.println("\n\n**** CLIENT'S BILL ****\n");
        //FORMULA
        drs_fee = anaesthesiologist_fee+specialist_fee+surgions_fee;
        System.out.printf("\nDoctor's fee  : %,.2f\n",drs_fee);
        //FORMULA
        lab_fees = xray+cbc+blood_typing+urinalysis;
        System.out.printf("\nLab fees      : %,.2f\n",lab_fees);
        //FORMULA
        other_charges = extra_beddings+syringes+dextrose+dressing_liquid+medicine;
        System.out.printf("\nOther charges : %,.2f\n",other_charges);
        //FORMULA
        room_charges = confine_days+rrt_perday;
        System.out.printf("\nRoom charges  : %,.2f\n",room_charges);
        //FORMULA
        tax = ((other_charges*0.10)+(drs_fee*0.12));
        System.out.printf("\nTax           : %,.2f\n",tax);
        //FORMULA
        hospital_bill = drs_fee+lab_fees+other_charges+room_charges+tax;
        System.out.printf("\nHospital bill : %,.2f\n\n",hospital_bill);
    }
}
