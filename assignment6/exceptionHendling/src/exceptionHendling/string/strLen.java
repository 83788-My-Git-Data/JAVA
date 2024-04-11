package exceptionHendling.string;



public class strLen {
	private String strInput;
	
	

	public String getStrInput() {
		return strInput;
	}



	public void setStrInput(String strInput) throws ExceptionLineToolong {
		if(strInput.length()>80)
		{
			throw new ExceptionLineToolong("input string is more then 80 characters...!");
		}
		this.strInput = strInput;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
