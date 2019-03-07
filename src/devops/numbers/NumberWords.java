package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "" ;
		
		if(number < 0 || number > 999)
		{
			return "Number out of range";
		}
		else if(number == 0){
			System.exit(0);
		}
		else
		if(number/100 != 0)
		{
			int digit1 = number/100;
			
			switch(digit1)
			{
			case 1:
				result += "One";
				break;
			case 2:
				result += "Two";
				break;
			case 3:
				result += "Three";
				break;
			case 4:
				result += "Four";
				break;
			case 5:
				result += "Five";
				break;
			case 6:
				result += "Six";
				break;
			case 7:
				result += "Seven";
				break;
			case 8:
				result += "Eight";
				break;
			case 9:
				result += "Nine";
				break;
			}
			result += " hundred and ";
			
		}
		int modulo100 = number%100;
		
		int digit2 = modulo100/10;
		boolean mid1 = false;
		switch(digit2)
		{
		case 1:
			mid1 = true;
			break;
		case 2:
			result += "Twenty ";
			break;
		case 3:
			result += "Thirty ";
			break;
		case 4:
			result += "Forty ";
			break;
		case 5:
			result += "Fifty ";
			break;
		case 6:
			result += "Sixty ";
			break;
		case 7:
			result += "Seventy ";
			break;
		case 8:
			result += "Eighty ";
			break;
		case 9:
			result += "Ninety ";
			break;
		}
		
		int digit3 = modulo100%10;
		//result += " ";
		switch(digit3)
		{
		case 0:
			if(mid1)
				result += "Ten";
			break;
		case 1:
			if(mid1)
				result += "Eleven";
			else
				result += "One";
			break;
		case 2:
			if(mid1)
				result += "Twelve";
			else
				result += "Two";
			break;
		case 3:
			if(mid1)
				result += "Thirteen";
			else
				result += "Three";
			break;
		case 4:
			if(mid1)
				result += "Fourteen";
			else
				result += "Four";
			break;
		case 5:
			if(mid1)
				result += "Fifteen";
			else
				result += "Five";
			break;
		case 6:
			if(mid1)
				result += "Sixteen";
			else
				result += "Six";
			break;
		case 7:
			if(mid1)
				result += "Seventeen";
			else
				result += "Seven";
			break;
		case 8:
			if(mid1)
				result += "Eighteen";
			else
				result += "Eight";
			break;
		case 9:
			if(mid1)
				result += "Nineteen";
			else
				result += "Nine";
			break;
		}
		
		if(digit2 == 0 && digit3 == 0)
		{
			result = result.substring(0, result.lastIndexOf("and"));
		}
		
		return result.trim() ;
	}

}
