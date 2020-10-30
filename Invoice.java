class Invoice{
	public static void main (String amt[]){
	
	int invoiceAmount = 40000;
	float gst=0, invoiceBillWithGST=0;

	if(invoiceAmount<=10000){
	    gst = invoiceAmount*0.10f;
	    invoiceBillWithGST= invoiceAmount+gst;
	    System.out.println(invoiceBillWithGST);
	}
	else if(invoiceAmount>10000 && invoiceAmount<20000){
	    gst = invoiceAmount*0.15f;
	    invoiceBillWithGST= invoiceAmount+gst;	
	    System.out.println(invoiceBillWithGST);
	}
	else if(invoiceAmount>20000 && invoiceAmount<30000){
	    gst = invoiceAmount*0.18f;
	    invoiceBillWithGST= invoiceAmount+gst;	
	    System.out.println(invoiceBillWithGST);
	}
	else if(invoiceAmount>30000){
	    gst = invoiceAmount*0.20f;
	    invoiceBillWithGST= invoiceAmount+gst;	
	    System.out.println(invoiceBillWithGST);
	}
          }
}