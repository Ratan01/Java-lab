package Com.Java1.Module1;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int Copies;	
	
	static Item []items;
	static int index;
	
	static
	{
		items=new Item[20];
		index=0;
	}

	public Item(int id,String title,int copies){
		this.identificationNumber=id;
		this.title=title;
		this.Copies=copies;
		System.out.println("Parametrized Constructor in Item class");
	}	
	public Item() {
		this(0,"0",0);
		System.out.println("Default Constructor in Item class");
	}	
	public int getId() {
		return identificationNumber;
	}	
	public void setId(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}	
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return Copies;
	}
	public void setCopies(int Copies) {
		this.Copies = Copies;
	}
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", Copies=" + Copies + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber != other.identificationNumber)
			return false;
		if (Copies != other.Copies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	static public void print()
	{
		System.out.println("List of Items in the library: ");
		for(int i=0;i<index;i++)
			System.out.println(items[i]);
	}
/*	static public void  checkIn()
	{
		System.out.println("Select the purpose of checking In:");
		System.out.println("1: Return an Item");
		System.out.println("2: Issue an Item");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1)
		{
			System.out.println("Enter the Identification Number:");
			int idNumber=sc.nextInt();
			int flag=0;
			for(int i=0;i<index;i++)
			{
				if(items[i].getIdentification_number()==idNumber)
				{
					items[i].setNumberOfCopies(items[i].getNumberOfCopies()+1);
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("Item is Returned Successfully!!!");
			else
				System.out.println("There is no Item with this Identification Number in the Stock");
		}
		else if(input==2)
				checkOut();
		else
			System.out.println("Wrong Choice Entered!!!! Try checkIn Menu once again");
		sc.close();
	}
	static public void checkOut()
	{
		System.out.println("Enter the Identification Number:");
		Scanner sc1=new Scanner(System.in);
		int idNum=0;
		if(sc1.hasNextInt())
			idNum=sc1.nextInt();
		
		int flag=0;
		for(int i=0;i<index;i++)
		{
			if(items[i].getIdentification_number()==idNum)
			{
				items[i].setNumberOfCopies(items[i].getNumberOfCopies()-1);
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Item is Issued Successfully!!!");
		else
			System.out.println("There is no Item with this Identification Number in the Stock!!! Try checkOut operation once again");
		sc1.close();
	}
	
*/	
	public void checkIn()
	{
		this.setCopies(getCopies()+1);
		System.out.println("Item is Returned");
	}
	public void checkOut()
	{
		this.setCopies(getCopies()-1);
		System.out.println("Item is Issued");
	}
	public void addItem()
	{
		items[index++]=this;
		System.out.println("Item is Added Successfully");
	}
}