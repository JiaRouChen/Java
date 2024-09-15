package InterfacePayable_05;

public class InterfacePayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		Payable payableArray[] = new Payable[10];
		
		payableArray[0] = new Invoice("G01","奶嘴",200,2);
		payableArray[1] = new Invoice("G02","奶瓶",700,3);
		payableArray[2] = new SalariedEmployee("小北","李","Q854712369",30000);
		payableArray[3] = new SalariedEmployee("全聯","陳","D874521475",40000);
		payableArray[4] = new HourlyEmployee("頂好","吳","M254874532",200,42);
		payableArray[5] = new BasePlusCommissionEmployee("愛買","風","F225478998",20000,0.5,10000);
		payableArray[6] = new CommissionEmployee("全家","王","L224789545",10000,0.5);
		
		for(i=0; i< payableArray.length; i++) {
			if(payableArray[i] != null) {
				System.out.printf("%n%s%d%s :%n%s%n","第",(i+1),"筆應付帳款資料",payableArray[i].toString());
				
				if(payableArray[i].getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
					BasePlusCommissionEmployee temp = ((BasePlusCommissionEmployee)payableArray[i]);
					temp.setCommissionRate(temp.getCommissionRate()*1.5);
					System.out.printf("%n%s%d%s :%n%s%n","獎金比率提高50%後，第",(i+1),"位員工資料",payableArray[i].toString());
				
					}

			}
		}
	}
}
